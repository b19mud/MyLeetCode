package com.leetcode.test;

import java.util.EnumSet;

public class MyEnumSet {
    public static void main(String[] args){
    }

}

enum testEnum{

    ONE("one"),

    TWO("two"),

    THREE("three");

    private String name;
    testEnum(String name){
        this.name = name;
    }
}
