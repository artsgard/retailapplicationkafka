package com.artsgard.retailapplicationkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductMessagingServiceImpl implements ProductMessagingService {

    @Autowired
    private KafkaTemplate<String, Product> kafkaTemplate;

    /*
    @Autowired
    public ProductMessagingServiceImpl(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    */
    @Override
    public void sendProduct(Product product) {
        kafkaTemplate.send("new-message", product);
    }




}
