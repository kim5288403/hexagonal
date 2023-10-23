package com.example.hexagonal.post.appilcation.port.in;

import com.example.hexagonal.post.domain.model.Post;

public interface PostUseCase {
    Post detail(Long id);
    Post write(String content);
}
