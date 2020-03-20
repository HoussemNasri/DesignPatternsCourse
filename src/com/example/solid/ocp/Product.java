package com.example.solid.ocp;

import com.example.solid.ocp.criteria.Color;
import com.example.solid.ocp.criteria.Size;

public class Product {
    private String mName;
    private Color mColor;
    private Size mSize;

    public Product(String name, Color color, Size size) {
        this.mName = name;
        this.mColor = color;
        this.mSize = size;
    }

    public String getName() {
        return mName;
    }

    public Color getColor() {
        return mColor;
    }

    public Size getSize() {
        return mSize;
    }
}
