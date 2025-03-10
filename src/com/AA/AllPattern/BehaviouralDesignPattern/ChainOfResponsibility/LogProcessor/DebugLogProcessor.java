package com.AA.AllPattern.BehaviouralDesignPattern.ChainOfResponsibility.LogProcessor;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG) {
            System.out.println("Message is: "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
