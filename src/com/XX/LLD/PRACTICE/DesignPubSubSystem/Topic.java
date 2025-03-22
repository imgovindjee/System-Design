package com.XX.LLD.PRACTICE.DesignPubSubSystem;

import java.util.HashSet;
import java.util.Set;

public class Topic {

    private String name;
    private Set<Subscriber> subscriberSet;

    public Topic(String name){
        this.subscriberSet = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subscriber> getSubscriberSet() {
        return subscriberSet;
    }

    public void setSubscriberSet(Set<Subscriber> subscriberSet) {
        this.subscriberSet = subscriberSet;
    }

    public void addSubscribers(Subscriber subscriber){
        subscriberSet.add(subscriber);
    }

    public void removeSubscribers(Subscriber subscriber){
        subscriberSet.remove(subscriber);
    }

    public void publish(Message message){
        for (Subscriber subscriber:subscriberSet){
            subscriber.onMessage(message);
        }
    }
}
