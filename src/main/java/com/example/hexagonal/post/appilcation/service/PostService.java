package com.example.hexagonal.post.appilcation.service;

import com.example.hexagonal.post.appilcation.port.in.DetailUseCase;
import com.example.hexagonal.post.appilcation.port.in.WriteUseCase;
import com.example.hexagonal.post.appilcation.port.out.LoadPostPort;
import com.example.hexagonal.post.appilcation.port.out.SavePostPort;
import com.example.hexagonal.post.domain.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService implements WriteUseCase, DetailUseCase {

    private final SavePostPort savePostPort;
    private final LoadPostPort loadPostPort;

    @Override
    public Post write(String content) {
        Post post = Post.create(content);
        return savePostPort.save(post);
    }

    @Override
    public Post detail(Long id) {
        return loadPostPort.load(id);
    }
}
