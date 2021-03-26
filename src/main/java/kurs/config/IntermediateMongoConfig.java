package kurs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
//@EnableMongoRepositories()
public class IntermediateMongoConfig {
    @Value("${intermediate.spring.data.mongodb.host}")
    private String host;

    @Value("${intermediate.spring.data.mongodb.database}")
    private String database;

    @Value("${intermediate.spring.data.mongodb.port}")
    private String port;

    @Bean("intermediateMongoFactory")
    public MongoDatabaseFactory intermediateMongoFactory() {
        String connectionString = String.format("mongodb://%s:%s/%s", host, port, database);
        return new SimpleMongoClientDatabaseFactory(connectionString);
    }
}
