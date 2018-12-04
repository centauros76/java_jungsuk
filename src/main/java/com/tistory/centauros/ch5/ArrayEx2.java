package com.tistory.centauros.ch5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Rene on 2018. 12. 4..
 * auth : Rene
 */
public class ArrayEx2 {

    public static void main(String[] args) {

        Log log = LogFactory.getLog("studyLogger");

        int arr[] = new int[5];

        int init = 10;

        for(int i=0; i<5; i++) {
            arr[i] = init;
            init += 10;
        }

        for (int j : arr) {
            System.out.println("arr :: " + j);
            log.debug("arr :: " + j);
        }
    }


}
