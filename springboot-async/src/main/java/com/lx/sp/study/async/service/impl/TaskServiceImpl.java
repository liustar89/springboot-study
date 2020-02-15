package com.lx.sp.study.async.service.impl;

import com.lx.sp.study.async.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author liuxing
 */
@Slf4j
@Service
public class TaskServiceImpl implements TaskService {

    @Async
    @Override
    public Future<String> getStringByAsync() {
        UUID uuid = UUID.randomUUID();
        try {
            TimeUnit.SECONDS.sleep(5L);
        } catch (InterruptedException e) {
            log.error("", e);
        }
        return new AsyncResult<>(uuid.toString());
    }
}
