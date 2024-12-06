package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ProducerSVC {
    private KafkaProducer1 kafkaProducer1;

    public ProducerSVC(KafkaProducer1 kafkaProducer1) {
        this.kafkaProducer1 = kafkaProducer1;

    }
    @PostConstruct
    void send(){
        kafkaProducer1.sendMessage("none","message1");
    }
}
