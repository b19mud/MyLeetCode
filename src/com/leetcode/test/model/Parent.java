package com.leetcode.test.model;

import java.util.Timer;
import java.util.TimerTask;

public class Parent {

    public Parent() {
        new Timer("aaa").schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("1111111");
            }
        },0,3000);
    }
}
