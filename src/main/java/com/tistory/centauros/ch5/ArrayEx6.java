package com.tistory.centauros.ch5;


/**
 * Created by Rene on 2018. 12. 5..
 * auth : Rene
 */
public class ArrayEx6 {
    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] b = a;

        for (Integer x : a) {
            for (Integer y : b) {
                if (x.intValue() != 1)
                    System.out.println(x.intValue() * y.intValue());
            }
        }
    }
}
