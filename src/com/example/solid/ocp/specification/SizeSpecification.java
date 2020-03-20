package com.example.solid.ocp.specification;

import com.example.solid.ocp.Product;
import com.example.solid.ocp.criteria.Size;

public class SizeSpecification implements Specification<Product> {
    private Size mSize;

    public SizeSpecification(Size size) {
        mSize = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == mSize;
    }
}
