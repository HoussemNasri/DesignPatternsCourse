package com.example.patterns.creational.Factory.FactoryMethod;


// Factory
class PointFactory {
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }
}
