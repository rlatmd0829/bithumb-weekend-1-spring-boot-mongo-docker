package com.wookcode.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorReferenceTest {

    @Test
    void main() {
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable t1 = () -> System.out.println("T1 execute");
    }
}