package com.example.demo.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ThreadPoolUtil {


    public static ExecutorService getPool(int corePoolSize,
                                          int maximumPoolSize,
                                          long keepAliveTime,
                                          ThreadFactory threadFactory, int queuedNum) {

        return new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(queuedNum),
                threadFactory,
                new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService getPool(int poolSize, ThreadFactory threadFactory) {

        return new ThreadPoolExecutor(
                poolSize,
                poolSize,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(),
                threadFactory,
                new ThreadPoolExecutor.AbortPolicy());
    }


    public static ExecutorService getPool(int poolSize, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {

        return new ThreadPoolExecutor(
                poolSize,
                poolSize,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(),
                threadFactory,
                rejectedExecutionHandler);
    }

    public static ThreadFactory getNamedThreadFactory(String namePattern){
        return new ThreadFactoryBuilder().setNameFormat(namePattern).build();
    }

}
