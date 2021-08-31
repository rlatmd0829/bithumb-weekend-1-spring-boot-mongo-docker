package com.wookcode.api.customer.lambda;

@FunctionalInterface
public interface MyUnaryOp {
    int operator(Integer a);
}
