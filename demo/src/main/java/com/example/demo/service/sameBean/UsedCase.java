package com.example.demo.service.sameBean;

import org.springframework.beans.factory.annotation.Autowired;

public class UsedCase {
    @Autowired
   private Notification notification;
    public static void main(String[] args) {

    }

    public String getNotification() {
        return notification.massege();
    }
}
