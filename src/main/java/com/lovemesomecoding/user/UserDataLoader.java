package com.lovemesomecoding.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUuid("user-"+UUID.randomUUID().toString());
            user.setFirstName("Folau");
            user.setLastName("Kaveinga");
            user = userRepository.saveAndFlush(user);
        }
    }

}
