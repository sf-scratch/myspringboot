package com.lh.springcloud.entities;

public class TingImpl implements Ting {
    @Override
    public void eating(String s) {
        System.out.println(s);
        System.out.println("吃饭了");
    }
}
