package com.XX.LLD.PRACTICE.DesignPubSubSystem;

import java.util.HashSet;
import java.util.Set;

public class Publisher {

    private Set<Topic> topicSet;

    public Publisher(){
        this.topicSet = new HashSet<>();
    }

    public void registerTopic(Topic topic){
        topicSet.add(topic);
    }

    public void publish(Topic topic, Message message){
        if (!topicSet.contains(topic)){
            System.out.println("This publisher can't publish to topic: "+topic.getName());
            return;
        }
        topic.publish(message);
    }
}
