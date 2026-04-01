package com.example.demo.service.stringQuestion;

import java.lang.reflect.Field;

public class StringModification {
    public static void main(String[] args) throws NoSuchFieldException {
        String val="Unmodify";
        Field ff=String.class.getDeclaredField(val);

    }
}
