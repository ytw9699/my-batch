package com.example.mybatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableScheduling//@Scheduled 붙은 메서드 찾아서 실행
@EnableAsync//비동기 실행 허용
@SpringBootApplication
public class MyBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatchApplication.class, args);
    }

}
