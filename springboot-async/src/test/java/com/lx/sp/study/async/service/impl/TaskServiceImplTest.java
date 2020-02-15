package com.lx.sp.study.async.service.impl;

import com.lx.sp.study.async.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskServiceImplTest {

    @Autowired
    TaskService taskService;

    @Test
    void getStringByAsync() {
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                 Future<String> stringByAsync = taskService.getStringByAsync();
                try {
                    String s = stringByAsync.get();
                    log.info("获取值 : {}",s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}