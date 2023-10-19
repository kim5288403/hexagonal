package com.example.hexagonal.post.adapter.in.web;

import com.example.hexagonal.post.adapter.in.web.dto.request.WriteRequest;
import com.example.hexagonal.post.appilcation.port.in.DetailUseCase;
import com.example.hexagonal.post.appilcation.port.in.WriteUseCase;
import com.example.hexagonal.post.domain.model.Post;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final WriteUseCase writeUseCase;
    private final DetailUseCase detailUseCase;

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public Post detail(@PathVariable Long id) {
        return detailUseCase.detail(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "")
    public void write(@Valid WriteRequest writeRequest) {
        writeUseCase.write(writeRequest.getContent());
    }
}
