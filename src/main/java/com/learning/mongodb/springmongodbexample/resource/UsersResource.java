package com.learning.mongodb.springmongodbexample.resource;

import com.learning.mongodb.springmongodbexample.document.Users;
import com.learning.mongodb.springmongodbexample.repository.UsersRespository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRespository userRepository;

    public UsersResource(UsersRespository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return userRepository.findAll();
    }
}
