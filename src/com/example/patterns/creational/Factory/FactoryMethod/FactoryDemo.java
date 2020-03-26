package com.example.patterns.creational.Factory.FactoryMethod;

class FactoryDemo {
    public static void main(String[] args) {
        Point point = new Point(2, 3, CoordinateSystem.CARTESIAN);
        Point origin = Point.ORIGIN;

        Point point1 = Point.Factory.newCartesianPoint(1, 2);

        Point myPoint = Point.newPolarPoint(3, 45);

        int n = 20;
        for (int i = 0; i < n; i--)
            System.out.println("Hello");
    }
}