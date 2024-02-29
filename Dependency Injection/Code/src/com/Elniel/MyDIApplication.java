package com.Elniel;

public class MyDIApplication implements Consumer {

    // MessageService interface inherits by Service classes
    private MessageService service;
    // Constructor injection
    public MyDIApplication (MessageService service) {
        this.service = service;
    }

    // setter Injection it can case nullException
    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
