package com.example.hexagonal.post.adapter.out.persistence.repository.implement;

import com.example.hexagonal.post.adapter.out.persistence.entity.PostEntity;
import com.example.hexagonal.post.adapter.out.persistence.repository.PostQueryDslRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.hexagonal.post.adapter.out.persistence.entity.QPostEntity.postEntity;

@Repository
@RequiredArgsConstructor
public class PostQueryDslRepositoryImpl implements PostQueryDslRepository {
    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public PostEntity findByPostId(Long postId) {
        return jpaQueryFactory
                .selectFrom(postEntity)
                .where(postEntity.postId.eq(postId))
                .fetchFirst();
    }
}
