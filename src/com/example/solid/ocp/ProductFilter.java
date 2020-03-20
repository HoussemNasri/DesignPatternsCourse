package com.example.solid.ocp;

import com.example.solid.ocp.specification.Filter;
import com.example.solid.ocp.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(i ->specification.isSatisfied(i));
    }
}
