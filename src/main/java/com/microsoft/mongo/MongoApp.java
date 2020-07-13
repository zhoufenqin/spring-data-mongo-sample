package com.microsoft.mongo;

import com.mongodb.client.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@SpringBootApplication
public class MongoApp implements CommandLineRunner {

//    private static final Log log = LogFactory.getLog(MongoApp.class);
    private static final Logger logger = LoggerFactory.getLogger(MongoApp.class);


//    @Autowired
//    @Qualifier("secondTemplate")
//    private MongoTemplate mongoTemplate;
//    @Autowired
//    @Qualifier("myTemplate")
//    private MongoTemplate mongoTemplate1;

    @Autowired
    private MongoClient mongoClient;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MongoApp.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("in");
        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, "mytest");
        MongoTemplate mongoTemplate1 = new MongoTemplate(mongoClient, "mytest2");

        System.out.println("hello");
        System.out.println(mongoTemplate.findOne(new Query(where("name").is("Joe")), Person.class));
//        System.out.println(mongoTemplate1.findOne(new Query(where("name").is("Fen")), Person.class));
        System.out.println(mongoTemplate1.getDb().getName());
        System.out.println(mongoTemplate.getDb().getName());

    }

    @PostConstruct
    public void setup() {
//        mongoTemplate.insert(new Person("Joe", 34));
//        mongoTemplate1.insert(new Person("Fen", 30));
    }

    @PreDestroy
    public void cleanup() {

//        mongoTemplate.dropCollection("person");
//        mongoTemplate1.dropCollection("person");
    }
}