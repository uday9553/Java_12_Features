package com.uday;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorExample {
    public static void main(String[] args) {

        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        Collectors.summingDouble(i ->{System.out.println(i);return  i;} ),
                        Collectors.counting(),
                        (sum, n) -> {
                            System.out.println("sum is "+sum);
                            System.out.println("value of n is "+n);
                            return (sum / n);
                        }));


        System.out.println(mean);
    }


}
