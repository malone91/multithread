package com.melo.threadlocal;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用threadlocal来解决该问题
 * Created by Ablert
 * on 2018/5/21.
 * @author Ablert
 */
public class TestMultiThreadLocal {

    public static void main(String[] args) {
        List<SmsThreadLocal> smsList = new ArrayList<SmsThreadLocal>();
        SmsThreadLocal sms = new SmsThreadLocal();
        for (int i=0; i<3; i++) {
            //变换不同的位置
            sms.setId(1);
            sms.setPhone("" + i);
            smsList.add(sms);
            SendMessageThreadLocal sendMessageThread = new SendMessageThreadLocal();
            sendMessageThread.smsThreadLocal.set(sms);
            sendMessageThread.start();
        }
    }
}
