package com.annagzowska.springtutorial.implementation;

import com.annagzowska.springtutorial.api.Logger;

import java.util.Date;

/**
 * Created by gzowska on 2017-03-03.
 */
public class LoggerImpl implements Logger{
    public void log (String message) {
        System.out.println(new Date() + ": " + message);
    }
}
