package com.XX.LLD.PRACTICE.WhatsappDesign;

import java.util.List;

public class MessageEncryptionDecorator extends Message{

    private Message message;

    public MessageEncryptionDecorator(Message message) {
        super(message.getMessageID(), message.getSender(), message.getReceivers(), message.getContent());
        this.message = message;
    }

    @Override
    public String getContent(){
        return message.getContent();
    }

    @Override
    public boolean isEncrypted(){
        return true;
    }
}
