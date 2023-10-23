package com.example.hexagonal.post.adapter.in.config;

import com.example.hexagonal.post.adapter.out.persistence.repository.PostRepositoryAdapter;
import com.example.hexagonal.post.appilcation.port.in.PostUseCase;
import com.example.hexagonal.post.appilcation.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PostUseCase postUseCase (PostRepositoryAdapter postRepositoryAdapter) {
        return new PostService(postRepositoryAdapter);
    }
}
