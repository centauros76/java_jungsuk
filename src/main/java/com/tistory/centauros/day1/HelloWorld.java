package com.tistory.centauros.day1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by centauros on 2018-06-13.
 */
public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("HelloWorld");

        Log log = LogFactory.getLog("studyLogger");
        log.debug("test");

    }
}
