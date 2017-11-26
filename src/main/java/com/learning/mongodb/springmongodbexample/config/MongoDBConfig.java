package com.learning.mongodb.springmongodbexample.config;

import com.learning.mongodb.springmongodbexample.document.Users;
import com.learning.mongodb.springmongodbexample.repository.UsersRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRespository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRespository usersRespository){
        return strings -> {
            usersRespository.save(new Users(1, "Peter", "Developeent", 3000L));
            usersRespository.save(new Users(2, "Sam", "Operations", 2000L));
        };
    }
}
