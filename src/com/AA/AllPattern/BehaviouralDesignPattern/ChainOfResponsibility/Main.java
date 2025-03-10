package com.AA.AllPattern.BehaviouralDesignPattern.ChainOfResponsibility;

import com.AA.AllPattern.BehaviouralDesignPattern.ChainOfResponsibility.LogProcessor.DebugLogProcessor;
import com.AA.AllPattern.BehaviouralDesignPattern.ChainOfResponsibility.LogProcessor.InfoLogProcessor;
import com.AA.AllPattern.BehaviouralDesignPattern.ChainOfResponsibility.LogProcessor.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(null));
        logProcessor.log(LogProcessor.INFO, "Information Sent");
        logProcessor.log(LogProcessor.DEBUG, "need to be Debugged");
    }
}
