package com.XX.LLD.PRACTICE.DesignPubSubSystem;

public class PubSubSystemImplementation {
    public static void run(){
//        Create topic
        Topic topic1 = new Topic("TOPIC-1");
        Topic topic2 = new Topic("TOPIC-2");
        Topic topic3 = new Topic("TOPIC-3");

//        Create publisher
        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();
        Publisher publisher3 = new Publisher();

//        Create Subscriber
        Subscriber subscriber1 = new PrintSubscriber("Subscriber-1");
        Subscriber subscriber2 = new PrintSubscriber("Subscriber-2");
        Subscriber subscriber3 = new PrintSubscriber("Subscriber-3");

//        Register a topic
        publisher1.registerTopic(topic1);
        publisher2.registerTopic(topic2);
        publisher3.registerTopic(topic3);

//        Search a topic
        topic1.addSubscribers(subscriber1);
        topic1.addSubscribers(subscriber3);
        topic3.addSubscribers(subscriber3);
        topic2.addSubscribers(subscriber2);
        topic2.addSubscribers(subscriber3);

//        Publish Message
        publisher1.publish(topic1, new Message("Message-1 for topic-1"));
        publisher1.publish(topic1, new Message("Message-2 for topic-1"));
        publisher2.publish(topic2, new Message("Message-1 for topic-2"));
        publisher3.publish(topic3, new Message("Message-1 for topic-3"));

//        Unsubscribe from a topic
        topic1.removeSubscribers(subscriber3);

//        Publish more message
        publisher1.publish(topic1, new Message("Message-3 for topic-1"));
        publisher3.publish(topic3, new Message("Message-2 for topic-2"));
    }
}
