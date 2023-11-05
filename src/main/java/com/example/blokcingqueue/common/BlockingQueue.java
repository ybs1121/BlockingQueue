package com.example.blokcingqueue.common;

import lombok.extern.slf4j.Slf4j;
import java.util.LinkedList;
import java.util.List;

//@Component
@Slf4j
public class BlockingQueue {

    //    @Value("${queue.limit1}") // Inject the limit value from Spring properties
    private int limit;
    private List<Object> queue = new LinkedList<>();

    public BlockingQueue (int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            log.info("queue is full");
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized Object dequeue() throws InterruptedException {
        while (this.queue.size() == 0) {
            log.info("is 0");
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }
        return this.queue.remove(0);
    }

    // Setter method to change the limit value if needed
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }
}
