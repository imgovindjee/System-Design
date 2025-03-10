package com.XX.LLD.PRACTICE.WhatsappDesign;

import java.util.List;

public class SearchManager {

    private MessageSearchStrategy searchStrategy;

    public void setSearchStrategy(MessageSearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public List<Message> searchMessage(List<Message> messages, String keyword){
        return searchStrategy.searchMessage(messages, keyword);
    }
}
