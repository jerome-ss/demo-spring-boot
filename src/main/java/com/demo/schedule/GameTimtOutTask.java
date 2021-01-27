package com.demo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 游戏超时未开始中止
 * 启动类需要加注解：@EnableScheduling
 *
 * @author jerome
 * @see <a href="https://docs.spring.io/spring/docs/current/spring-framework-reference/html/scheduling.html">Task
 * Execution and Scheduling</a>
 * @see <a href="http://blog.csdn.net/prisonbreak_/article/details/49180307">使用Spring的@Scheduled实现定时任务</a>
 * @since 2017/6/11 17:16
 */
@Component
public class GameTimtOutTask {

    @Scheduled(fixedDelay = 5000)
    // @Scheduled(cron = "0 0 3 * * ?") //每天凌晨3:00执行任务
    public void startTask() {
        System.out.println("gameTimtOutTask start.");

        System.out.println("gameTimtOutTask end.");
    }

}
