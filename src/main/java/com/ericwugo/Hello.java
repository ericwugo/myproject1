package com.ericwugo;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Eric Wu World");
        Person p = new Person();
        p.hello();
        new Person().hello();
    }
}
