package com.example.hexagonal.repository;

import com.example.hexagonal.entity.Post;

public interface PostCustomRepository {
    Post findByPostId(Long postId);
}
