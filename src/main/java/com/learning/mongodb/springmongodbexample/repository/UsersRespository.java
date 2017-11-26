package com.learning.mongodb.springmongodbexample.repository;

import com.learning.mongodb.springmongodbexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRespository extends MongoRepository<Users, Integer>{
        }
