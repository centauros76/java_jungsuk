package com.tistory.centauros.ch5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by centauros on 2018-12-04.
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("studyLogger");
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for (int i=0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }

        int index = 0;
        for (int i: score) {
            System.out.println("score["+index+"] :: " + i);
            log.debug("score["+index+"]  :: " + i);
            index++;
        }
    }
}
