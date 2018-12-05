package com.tistory.centauros.ch5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rene on 2018. 12. 5..
 * auth : Rene
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("studyLogger");

        Integer[] arrInt = {1, 2, 3, 4, 5};
        ArrayList<Integer> al = new ArrayList(Arrays.asList(arrInt));
        System.out.println(al);

        for (Integer a : al) {
            System.out.println("a ::" + a.intValue());
            log.debug("a :: " + a.intValue());
        }

    }
}
