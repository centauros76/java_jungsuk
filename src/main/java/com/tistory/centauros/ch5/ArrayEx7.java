package com.tistory.centauros.ch5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by centauros on 2018-12-11.
 */
public class ArrayEx7 {

    public static void main(String[] args) {
        Log  log = LogFactory.getLog("studyLogger");

        char[] test1 = {'a', 'b', 'c', 'd', 'e'};
        char[] test2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        char[] result = new char[5];

        System.arraycopy(test1, 0, result, 0, 5);
        for (char c : result) {
            log.debug("result :: " + c);
            System.out.println("result :: " + c);
        }

        System.arraycopy(test2, 1, result, 0, 4);
        for (char c : result) {
            log.debug("result :: " + c);
            System.out.println("result :: " + c);
        }

    }
}
