package com.example.hexagonal.post.appilcation.port.out;

import com.example.hexagonal.post.domain.model.Post;

public interface PostOutPort {
    Post load(Long id);
    Post save(Post post);
}
