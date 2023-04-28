package com.roman.reactive.project.client.reactive_client.controller;

import com.roman.reactive.project.client.reactive_client.entity.Content;
import com.roman.reactive.project.client.reactive_client.entity.User;
import com.roman.reactive.project.client.reactive_client.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 10)
public class MyController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/contents/getUserContent")
    @ResponseBody
    public Flux<Content> getContentByUserId(Authentication authentication) {
        User user = (User)authentication.getPrincipal();
        long userId = user.getId();
        String name = authentication.getName();
        return contentService.findContentByUserId(userId);
    }

}
