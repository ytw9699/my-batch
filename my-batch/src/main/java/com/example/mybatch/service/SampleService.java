package com.example.mybatch.service;

import lombok.extern.slf4j.Slf4j;
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
}
