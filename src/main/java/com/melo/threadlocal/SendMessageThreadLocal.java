package com.melo.threadlocal;

/**
 * Created by Ablert
 * on 2018/5/21.
 * @author Ablert
 */
public class SendMessageThreadLocal extends Thread {

    public ThreadLocal<SmsThreadLocal> smsThreadLocal = new ThreadLocal<SmsThreadLocal>();

    @Override
    public void run() {
        System.out.println(smsThreadLocal.get() != null ? smsThreadLocal.get() : "传值为空");
    }
}
