package com.example.patterns.creational.Factory.FactoryMethod;


import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;

class Point {
    // singleton field
    public static final Point ORIGIN = new Point(0, 0);
    private double x, y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // steps to add a new system
    // 1. augment CoordinateSystem
    // 2. change ctor


    // ugly constructor
    // think about how if we have many other coordinates systems
    // arguments names do not communicate intent
    public Point(double a,
                 double b,
                 CoordinateSystem cs) {
        switch (cs) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
        }
    }

    // factory method
    // method name and variables names express intent, this is the main purpose of factory method
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        double localX = rho * Math.cos(theta);
        double localY = rho * Math.sin(theta);
        return new Point(localX, localY);
    }


    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }
    }

    @Override
    public String toString() {
        Format pointFormat = new DecimalFormat("#.###");
        return "Point{" +
                "x=" + pointFormat.format(x) +
                ", y=" + pointFormat.format(y) +
                '}';
    }
}


