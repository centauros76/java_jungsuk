package com.tistory.centauros.ch5;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by centauros on 2018-12-12.
 */
public class ArrayEx8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

//        StringBuilder result = new StringBuilder();
//        for(Integer num : list) {
//            result.append(num).append(" : ");
//        }
//

        String result = list.stream()
                            .map(String::valueOf)
                            .collect(joining(" : "));
        System.out.println(result);
    }
}
