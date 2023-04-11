package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class MathUtil {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
