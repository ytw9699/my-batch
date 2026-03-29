package com.example.mybatch.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SampleService {

    public void execute() {
        log.info("service execute...");
    }

    public void execute2() {
        log.info("service execute2...");
    }

    //@Async
    public void execute3(int num) {
        log.info("start {} thread={}", num, Thread.currentThread().getName());

        try {
            Thread.sleep(3000); // 작업 시간
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        log.info("end {} thread={}", num, Thread.currentThread().getName());
    }
}
