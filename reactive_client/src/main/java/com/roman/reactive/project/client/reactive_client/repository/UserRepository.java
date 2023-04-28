package com.roman.reactive.project.client.reactive_client.repository;

import com.roman.reactive.project.client.reactive_client.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

    Mono<User> findByUsername(String login);
}
