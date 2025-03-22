package com.XX.LLD.PRACTICE.WhatsappDesign;

import java.util.ArrayList;
import java.util.List;

public class MessageManager {

    private List<Message> sentMessage;
    private List<Message> receivedMessage;

    public MessageManager(){
        this.sentMessage = new ArrayList<>();
        this.receivedMessage = new ArrayList<>();
    }

    public void sendMessage(Message message){
        sentMessage.add(message);
        System.out.println("Message Send....");
    }

    public void receivedMessage(Message message){
        receivedMessage.add(message);
        System.out.println("Message Received...");
    }
}
