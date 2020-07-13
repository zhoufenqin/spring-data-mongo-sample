package com.microsoft.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.config.MongoConfigurationSupport;
import org.springframework.data.mongodb.config.MongoDbFactoryParser;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoDatabaseFactorySupport;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class AppConfig {
//    @Bean
//    public MongoClient mongoClient() {
//        return MongoClients.create("mongodb://localhost:27017");
//    }
    /*
     * Factory bean that creates the com.mongodb.client.MongoClient instance
     */
//    public @Bean
//    MongoClientFactoryBean mongo() {
//        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
//        mongo.setHost("localhost");
//        return mongo;
//    }


//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoClient(), "mydatabase");
//    }
//    @Bean
//    public MongoTemplate mongoTemplate1() {
//        return new MongoTemplate(mongoClient(), "mydatabase1");
//    }

//    @Autowired
//    MongoClient mongoClient;
//


    @Autowired
    MongoProperties mongoproperties;

    @Bean(name = "myTemplate")
    public MongoTemplate myTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "mydatabase");
    }

//    @Bean(name = "secondTemplate")
//    public MongoTemplate secondTemplate(MongoClient mongoClient) {
//        return new MongoTemplate(mongoClient, "seconddatabase");
//    }
    @Bean(name = "secondTemplate")
    public MongoTemplate secondTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "seconddatabase");
    }

//    @Bean
//    MongoDatabaseFactorySupport mongoDatabaseFactory(MongoClient mongoClient) {
//        return new SimpleMongoClientDatabaseFactory(mongoClient, "mydatabase");
//    }



}
