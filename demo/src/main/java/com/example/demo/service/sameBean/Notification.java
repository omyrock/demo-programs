package com.example.demo.service.sameBean;

import org.springframework.stereotype.Component;

public interface Notification {
    public String massege();
}
@Component
class SMS implements Notification{

    @Override
    public String massege() {
        return "SMS";
    }
}
@Component
class Email implements Notification{

    @Override
    public String massege() {
        return "EMAIL";
    }
}
