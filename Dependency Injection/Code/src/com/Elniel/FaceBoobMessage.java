package com.Elniel;

public class FaceBoobMessage implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("FaceBook message to " + rec + "\n" + " with message :" + msg);
    }
}
