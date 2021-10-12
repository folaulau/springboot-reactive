package com.lovemesomecoding;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lovemesomecoding.user.User;
import com.lovemesomecoding.user.UserRepository;

@SpringBootTest
class SpringbootReactiveApplicationTests {

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    public void init() {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setFirstName("Folau");
            user.setLastName("Kaveinga");
            user = userRepository.saveAndFlush(user);
        }
    }

    @Test
    void contextLoads() {
    }

}
