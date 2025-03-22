package com.XX.LLD.PRACTICE.WhatsappDesign;

import java.util.List;

public interface MessageSearchStrategy {
    List<Message> searchMessage(List<Message> messages, String keyBoard);
}
