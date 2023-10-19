package com.example.hexagonal.post.appilcation.port.in;

import com.example.hexagonal.post.domain.model.Post;

public interface DetailUseCase {
    Post detail(Long id);
}
