package com.example.demo.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ThreadPoolUtil {

    public static ExecutorService getPool(int corePoolSize,
                                             int maximumPoolSize,
                                             long keepAliveTime,
                                             ThreadFactory threadFactory) {

        return new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(50),
                threadFactory,
                new ThreadPoolExecutor.AbortPolicy());
    }

    public static ThreadFactory getNamedThreadFactory(String namePattern){
        return new ThreadFactoryBuilder().setNameFormat(namePattern).build();
    }

}
