package com.wookcode.api.customer.lambda;

@FunctionalInterface
public interface MyPredicate {
    boolean test(String str);
}
