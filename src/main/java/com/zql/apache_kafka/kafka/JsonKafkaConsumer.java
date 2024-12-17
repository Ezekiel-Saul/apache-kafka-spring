package com.zql.apache_kafka.kafka;

import com.zql.apache_kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "zql_json", groupId = "myGroup")
    public void consume(User user){
            LOGGER.info(String.format("Json Kafka Message received -> %s", user.toString()));
    }

}
