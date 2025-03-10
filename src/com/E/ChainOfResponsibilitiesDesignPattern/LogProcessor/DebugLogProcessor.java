package com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor loggorProcessor) {
        super(loggorProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG:- "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
