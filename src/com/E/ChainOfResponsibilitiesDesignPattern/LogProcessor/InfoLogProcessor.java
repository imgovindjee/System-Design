package com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor loggorProcessor) {
        super(loggorProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == INFO){
            System.out.println("INFO:- "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
