package com.AA.AllPattern.BehaviouralDesignPattern.ChainOfResponsibility.LogProcessor;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == INFO) {
            System.out.println("Message is: "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
