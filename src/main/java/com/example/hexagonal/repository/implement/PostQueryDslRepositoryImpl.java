package com.example.hexagonal.repository.implement;

import static com.example.hexagonal.entity.QPost.post;
import com.example.hexagonal.entity.Post;
import com.example.hexagonal.repository.PostQueryDslRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostQueryDslRepositoryImpl implements PostQueryDslRepository {
    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public Post findByPostId(Long postId) {
        return jpaQueryFactory
                .selectFrom(post)
                .where(post.postId.eq(postId))
                .fetchFirst();
    }
}
