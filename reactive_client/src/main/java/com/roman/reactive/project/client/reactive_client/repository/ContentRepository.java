package com.roman.reactive.project.client.reactive_client.repository;

import com.roman.reactive.project.client.reactive_client.entity.Content;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ContentRepository extends ReactiveCrudRepository<Content, Long> {

     Flux<Content> findByIdUser(long userId);

}
