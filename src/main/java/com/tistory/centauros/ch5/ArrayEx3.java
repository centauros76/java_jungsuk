package com.tistory.centauros.ch5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Rene on 2018. 12. 4..
 * auth : Rene
 */
public class ArrayEx3 {

    public static void main(String[] args) {

        Log log = LogFactory.getLog("studyLogger");

        int x[];
        int y[];
        x = y = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int row: x) {
            if (row != 1)
            for (int cols: y) {
                System.out.println(row +" * " + cols + " = " + (row*cols));
                log.info(row +" * " + cols + " = " + (row*cols));
            }
        }
    }
}
