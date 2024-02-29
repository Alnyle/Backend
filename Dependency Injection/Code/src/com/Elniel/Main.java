package com.Elniel;

public class Main {

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessage("Hi Ahmed", "Elniel@kim.com");

        MyDIApplication app2 = new MyDIApplication(new SMServiceImpI());
        app2.processMessages("Hello Ali", "Ali@kBC.com");

        MyDIApplication app3 = new MyDIApplication(new FaceBoobMessage());
        app3.processMessages("Hello my fried Salah", "Salah/facebook.com");
    }
}
