package com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor loggorProcessor) {
        super(loggorProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == ERROR) {
            System.out.println("ERROR:- " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
