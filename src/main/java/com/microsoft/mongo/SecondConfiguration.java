//package com.microsoft.mongo;
//
//import com.mongodb.client.MongoClients;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@Configuration
//@ConfigurationProperties(prefix = "spring.data.mongodb.second")
//public class SecondConfiguration extends AbstractMongoClientConfiguration {
//    @Bean(name = "secondTemplate")
//    public MongoTemplate secondTemplate() {
//        return new MongoTemplate(MongoClients.create("mongodb://localhost:27017"), "seconddatabase");
//    }
//
//    @Override
//    protected String getDatabaseName() {
//        return "seconddatabase";
//    }
//}
