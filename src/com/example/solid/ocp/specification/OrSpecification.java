package com.example.solid.ocp.specification;

import com.example.solid.ocp.Product;

public class OrSpecification implements Specification<Product> {

    private Specification<Product> specification1;
    private Specification<Product> specification2;

    public OrSpecification(Specification<Product> specification1, Specification<Product> specification2) {
        this.specification1 = specification1;
        this.specification2 = specification2;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return specification1.isSatisfied(item) || specification2.isSatisfied(item);
    }
}
