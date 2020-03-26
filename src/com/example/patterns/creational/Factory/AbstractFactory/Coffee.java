package com.example.patterns.creational.Factory.AbstractFactory;

class Coffee implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious.");
    }
}
