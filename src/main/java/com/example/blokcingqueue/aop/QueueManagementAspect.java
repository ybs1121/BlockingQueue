package com.example.blokcingqueue.aop;

import com.example.blokcingqueue.common.BlockingQueue;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class QueueManagementAspect {
    // TODO: 11/5/23 AOP를 사용해서 컨트롤러마다 관리하게 되면 요청마다 큐를 동적으로 생성하게 된다. AOP는 적합하지 않음
    private BlockingQueue queue;

//    @Before("execution(* com.example.blokcingqueue.controller.*.*(..))")
//    public void initQueue(JoinPoint joinPoint) throws InterruptedException {
//        String controllerName = joinPoint.getTarget().getClass().getSimpleName();
//        if ("TestController".equals(controllerName)) {
//            queue = new BlockingQueue(1);
//            log.info("TestController queue size : {}", queue.getLimit());
//        } else if ("TestAnotherController".equals(controllerName)) {
//            queue = new BlockingQueue(2);
//            queue.setLimit(2);
//
//            log.info("TestAnotherController queue size : {}", queue.getLimit());
//        }
//
//        queue.enqueue(joinPoint.getArgs());
//
//    }

//    @After("execution(* com.example.blokcingqueue.controller.*.*(..))")
//    public void processQueue(JoinPoint joinPoint) throws InterruptedException {
//        log.info("in?");
//        log.info(String.valueOf(System.identityHashCode(queue)));
//        if (queue != null) {
//            // 큐에 데이터가 있는지 확인
//            log.info("in??");
//            if (queue.getLimit() > 0) {
//                // dequeue 작업 수행
//                log.info("in??");
//                Object item = queue.dequeue();
//                log.info("Dequeued item: " + item);
//            }
//        }
//    }
}
