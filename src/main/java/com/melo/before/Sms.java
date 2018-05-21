package com.melo.before;

/**
 * 短信对象，参照项目中并发问题
 * Created by Ablert
 * on 2018/5/21.
 * @author Ablert
 */
public class Sms {

    private Integer id;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
