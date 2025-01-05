package com.E.ChainOfResponsibilitiesDesignPattern;

import com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor.DebugLogProcessor;
import com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor.InfoLogProcessor;
import com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor.ErrorLogProcessor;
import com.E.ChainOfResponsibilitiesDesignPattern.LogProcessor.LogProcessor;

public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR, "Exception Handles");
        logProcessor.log(LogProcessor.DEBUG, "need to be Debugged");
        logProcessor.log(LogProcessor.INFO, "Just for Info");
    }
}
