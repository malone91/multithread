package com.melo.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ablert
 * on 2018/5/21.
 * @author Ablert
 */
public class TestMultiThread {

    public static void main(String[] args) {
        List<Sms> smsList = new ArrayList<Sms>();
        Sms sms = null;
        for (int i=0; i<3; i++) {
            //变换不同的位置
            sms = new Sms();
            sms.setId(1);
            sms.setPhone("" + i);
            System.out.println(sms);
            smsList.add(sms);
            SendMessageThread sendMessageThread = new SendMessageThread(sms, i);
            System.out.println(i);
            sendMessageThread.start();
        }
    }
}
