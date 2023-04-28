package com.roman.reactive.project.client.reactive_client.service;

import com.roman.reactive.project.client.reactive_client.entity.Content;
import com.roman.reactive.project.client.reactive_client.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public Flux<Content> findContentByUserId(long userId) {
        return contentRepository.findByIdUser(userId);
    }

}
