package com.example.mybatch.scheduler;

import com.example.mybatch.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class TestScheduler {

    private final SampleService sampleService;

    /** 5초마다 실행 */
    @Scheduled(fixedDelay = 5000)
    public void run() {
        log.info("scheduler start");
        sampleService.execute();
    }

    /** 10초마다 실행 */
    @Scheduled(cron = "0/10 * * * * *")
    public void run2() {
        log.info("cron scheduler...");
        sampleService.execute2();
    }

    @Scheduled(fixedDelay = 15000)
    public void run3() {
        log.info("scheduler start thread={}", Thread.currentThread().getName());

        // 5개 작업 병렬 실행
        for (int i = 1; i <= 5; i++) {
            sampleService.execute3(i);
        }
    }
}