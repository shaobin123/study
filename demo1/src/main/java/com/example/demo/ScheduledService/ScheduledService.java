package com.example.demo.ScheduledService;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledService {

    @Scheduled(cron = "0/1 * * * * ? ")
    public void sayHello() {
        System.out.println("定时任务1：" + new Date());
    }

    @Scheduled(cron = "0/1 * * * * ? ")
    public void sayNo(){
        System.out.println("定时任务2"+new Date()+".......No");
    }
}
