package com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLoggorProcessor;
    public LogProcessor(LogProcessor loggorProcessor){
        this.nextLoggorProcessor = loggorProcessor;
    }

    public void log (int logLevel, String msg) {
        if(nextLoggorProcessor != null){
            nextLoggorProcessor.log(logLevel, msg);
        }
    }
}
