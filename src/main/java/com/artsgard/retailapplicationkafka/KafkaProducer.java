package com.artsgard.retailapplicationkafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, Product> kafkaTemplate; //@KafkaListener(topics = "${test.topic}")

    @Autowired
    private KafkaTemplate<String, List<Product>> kafkaTemplateList; //@KafkaListener(topics = "${test.topic}")

    public void send(String topic, Product payload) {
        LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
        kafkaTemplate.send(topic, payload);
    }

    public void sendList(String topic, List<Product> payload) {
        LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
        kafkaTemplateList.send(topic, payload);
    }

}