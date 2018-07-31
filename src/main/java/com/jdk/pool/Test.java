package com.jdk.pool;

/**
 * 线程池目录：
 * 1线程池场景及功能
 * 2阿里规约为何禁用线程池
 * 3线程池底层源码
 * @author dudu
 *
 */
public class Test {

    /**
     * 1:创建固定线程池
     *  newFixedThreadPool(int n)
     *  创建一个指定工作线程数量的线程池,附加维护一个池队列
     * 2:创建缓存线程池
     *  核心大小、最大大小、Time、Queue
     *  没有限制线程池大小
     * 3:
     * FixedThreadPool和SignalThreadPoolPool
     *  允许的请求队列长度为CoreSize，可能会堆积大量的请求，导致OOM
     * CacheThreadPool和ScheduledThreadPool
     *  允许创建的线程数量为Integer.MAX_VALUE，可能会创建大量的线程，导致OOM
     */
    
}
