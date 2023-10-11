package com.example.hexagonal.controller;

import com.example.hexagonal.entity.Post;
import com.example.hexagonal.repository.PostJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostJpaRepository postJpaRepository;

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public Post detail(@PathVariable Long id) {
        return postJpaRepository.findByPostId(id);
    }
}
