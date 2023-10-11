package com.example.hexagonal.repository;

import com.example.hexagonal.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<Post, Long>, PostCustomRepository {
}
