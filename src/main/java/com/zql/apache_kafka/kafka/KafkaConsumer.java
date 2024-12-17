package com.zql.apache_kafka.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "zql", groupId = "myGroup")
    public void consumer(String message){LOGGER.info(String.format("Kafka Messagge received -> %s", message));
    }


}
