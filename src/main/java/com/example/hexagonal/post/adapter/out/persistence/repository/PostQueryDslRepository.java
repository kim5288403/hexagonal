package com.example.hexagonal.post.adapter.out.persistence.repository;

import com.example.hexagonal.post.adapter.out.persistence.entity.PostEntity;

public interface PostQueryDslRepository {
    PostEntity findByPostId(Long postId);
}
