package com.example.solid.ocp.specification;

import com.example.solid.ocp.Product;
import com.example.solid.ocp.criteria.Color;

public class ColorSpecification implements Specification<Product> {
    private Color mColor;

    public ColorSpecification(Color color) {
        mColor = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == mColor;
    }

}
