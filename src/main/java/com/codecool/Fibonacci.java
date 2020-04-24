package com.codecool;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci implements Supplier<Integer> {

    private int previous = 1;
    private int current = 2;
    private int next;

    @Override
    public Integer get() {
        next = current + previous;
        int temp = previous;
        previous = current;
        current = next;
        return temp;
    }

    public static List<Integer> Fibonacci(int number) {
        return Stream.generate(new Fibonacci()).limit(number).collect(Collectors.toList());
    }


}
