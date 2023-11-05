package com.example.blokcingqueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BlokcingqueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlokcingqueueApplication.class, args);
    }

}
