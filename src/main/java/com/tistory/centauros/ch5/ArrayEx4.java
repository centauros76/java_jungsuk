package com.tistory.centauros.ch5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Created by centauros on 2018-12-05.
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("studyLogger");

        char[] cArr = {'a', 'b', 'c', 'd'};

        System.out.println("cArr :: " + cArr);
        System.out.println(cArr);
        log.debug("cArr :: " + cArr);
        log.debug(cArr);
    }
}
