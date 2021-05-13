package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @JoinColumn(name = "id", referencedColumnName = "posts")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;

    public User() {

    }

    public BigInteger getId() {
        return id;
    }
}
