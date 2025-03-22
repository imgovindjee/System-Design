package com.XX.LLD.PRACTICE.DesignPubSubSystem;

public class PrintSubscriber implements Subscriber{

    private String name;

    public PrintSubscriber(String name){
        this.name = name;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("Subscriber: "+name+"\treceived message: "+message.getContent());
    }
}
