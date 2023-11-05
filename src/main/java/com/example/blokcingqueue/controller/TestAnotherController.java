package com.example.blokcingqueue.controller;

import com.example.blokcingqueue.common.BlockingQueue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1")
public class TestAnotherController {

    private final BlockingQueue blockingQueue = new BlockingQueue(2);

    @PostMapping("/req")
    public String request(@RequestBody HashMap params) throws Exception {
        try {
            log.info("TestAnotherController queue : {}" ,String.valueOf(System.identityHashCode(blockingQueue)));
            blockingQueue.enqueue(params);
            log.info(blockingQueue.getLimit() + "");

            Thread.sleep(2000);

            blockingQueue.dequeue();



            // 요청 큐에서 빼기
        } catch (Exception e) {
            throw new Exception("Error");
        }

        return "OK";
    }
}
