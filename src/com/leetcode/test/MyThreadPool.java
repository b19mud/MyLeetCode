package com.leetcode.test;

import java.util.concurrent.*;

public class MyThreadPool {
    private static final LinkedBlockingQueue<Runnable> LINKED_BLOCKING_QUEUE = new LinkedBlockingQueue<>();

    public static void main(String[] args){
        TimeUnit unit;
        BlockingQueue workQueue;
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(1,5,20,TimeUnit.SECONDS,LINKED_BLOCKING_QUEUE);
    }
}
