package com.example.demo;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        return entityManager.createNativeQuery("SELECT * FROM users", User.class).getResultList();
    }

    public List<Post> findAllPosts() {
        return entityManager.createNativeQuery("SELECT * FROM posts", Post.class).getResultList();
    }
}
