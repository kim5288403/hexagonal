package com.example.hexagonal.post.appilcation.port.out;

import com.example.hexagonal.post.domain.model.Post;

public interface SavePostPort {
    Post save(Post post);
}
