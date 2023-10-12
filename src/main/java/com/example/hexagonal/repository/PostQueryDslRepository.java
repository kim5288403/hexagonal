package com.example.hexagonal.repository;

import com.example.hexagonal.entity.Post;

public interface PostQueryDslRepository {
    Post findByPostId(Long postId);
}
