package com.example.patterns.creational.Builder.fluentbuilder;


public class BUIDEMO {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle.Builder()
                .setHeight(200)
                .setWidth(250)
                .setY(10)
                .build();
        System.out.println(rec.toString());

    }
}
