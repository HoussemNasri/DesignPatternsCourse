package com.example.patterns.creational.Builder.fluentbuilder;

public class Rectangle {
    private double width = 100;
    private double height = 100;
    private double x = 0;
    private double y = 0;


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    static class Builder {
        private Rectangle rectangle = new Rectangle();


        public Builder setX(double x) {
            rectangle.x = x;
            return this;
        }

        public Builder setY(double y) {
            rectangle.y = y;
            return this;
        }

        public Builder setWidth(double width) {
            rectangle.width = width;
            return this;
        }

        public Builder setHeight(double height) {
            rectangle.height = height;
            return this;
        }

        public Rectangle build() {
            return rectangle;
        }


    }
}
