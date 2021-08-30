package com.wookcode.api.customer.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MyFunctionTest {

    @Test
    void main() {
        List<String> list = Arrays.asList("Bithumb", "Company", "Market");
        Function<String, Integer> function = String::length; // Function<들어오는값, 리턴값>
        List<Integer> newList = map(list, function);
        assertThat(newList.get(1), is(equalTo(7)));

    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){ // 접근제한자와 반환타입 사이에 제네릭 메소드가 있다.
        List<R> newList = new ArrayList<>();
        for(T e : list){
            newList.add(function.apply(e));
        }
        return newList;
    }
}