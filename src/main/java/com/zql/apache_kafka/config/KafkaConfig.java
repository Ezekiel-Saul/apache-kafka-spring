package com.zql.apache_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("zql")
                .build();
    }

    @Bean
    public NewTopic jsonTopic(){
        return TopicBuilder.name("zql_json")
                .build();
    }
}
