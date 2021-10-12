package com.lovemesomecoding.user;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends JpaRepository<User, Long> {

    Set<User> findByFirstName(String firstName);
}
