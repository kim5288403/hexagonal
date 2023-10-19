package com.example.hexagonal.post.adapter.out.persistence.mapper;

import com.example.hexagonal.post.adapter.out.persistence.entity.PostEntity;
import com.example.hexagonal.post.domain.model.Post;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PostMapper {

    Post toDomain(PostEntity postEntity);
    PostEntity toEntity(Post post);
}
