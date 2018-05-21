package com.melo.before;

/**
 * Created by Ablert
 * on 2018/5/21.
 * @author Ablert
 */
public class SendMessageThread extends Thread {

    private Sms sms;

    private int age;

    public SendMessageThread(Sms sms, int age) {
        this.sms = sms;
        this.age = age;
    }

    @Override
    public void run() {
        age++;
        System.out.println(sms.getPhone() + "," + age);
    }
}
