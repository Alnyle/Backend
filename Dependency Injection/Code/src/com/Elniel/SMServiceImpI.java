package com.Elniel;

public class SMServiceImpI implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS send to " + rec + " with message = " + msg);
    }
}
