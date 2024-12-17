package com.zql.apache_kafka.rest;

import com.zql.apache_kafka.kafka.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {

    private KafkaProducer producer;

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaController.class);

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    //http://localhost:8080/api/v1/kafka/publish/message=hello world
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
