package com.lx.sp.study.async.service;

import java.util.concurrent.Future;

/**
 * @author liuxing
 */
public interface TaskService {
    /**
     * 获取字符串信息通过异步方式
     *
     * @return
     */
    Future<String> getStringByAsync();

}
