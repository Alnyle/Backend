package com.Elniel;

import java.lang.*;
public class MyApplication {

    private EmailService email = new EmailService();

    public void processMessage(String msg, String rec) {
        // do some msg validation, manipulation logic etc
        this.email.sendMessage(msg, rec);
    }


}
