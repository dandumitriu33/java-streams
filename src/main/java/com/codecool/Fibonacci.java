package com.codecool;

import java.util.stream.Stream;

public class Fibonacci {

    public Stream<int[]> Fibonacci(){
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]});
//                .limit(10)
//                .map(i -> i[0])
//                .collect(Collectors.toList());
    }
}
