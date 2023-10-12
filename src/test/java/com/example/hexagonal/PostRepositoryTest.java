package com.example.hexagonal;

import com.example.hexagonal.config.QuerydslConfig;
import com.example.hexagonal.entity.Post;
import com.example.hexagonal.repository.PostRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(QuerydslConfig.class)
public class PostRepositoryTest {
    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    private PostRepository postRepository;

    @Test
    void notNullRepository() {
        assertNotNull(postRepository);
    }

    private void settingPost(Long postId) {
        Post saveData = Post
                .builder()
                .postId(postId)
                .content("content")
                .build();

        postRepository.save(saveData);
    }

    @Test
    public void givenValidPostId_whenFindByPostId_thenPostIsFound() {
        Long postId = 1L;
        settingPost(postId);

        Post result = postRepository.findByPostId(postId);

        assertNotNull(result);
        assertEquals(postId, result.getPostId());
    }
}
