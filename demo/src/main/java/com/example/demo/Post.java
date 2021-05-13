package com.example.demo;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "posts")
@Entity
public class Post {
    @Id
    private BigInteger id;

    @Column
    private String name;

    @Column
    private String content;

    @Column(name = "posting_date")
    private Date postingDate;

    @Column(name = "updating_date")
    private Date updatingDate;

    @OneToOne
    @JoinColumn(name = "author", referencedColumnName = "id")
    private User author;

    public Post() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", postingDate=" + postingDate +
                ", updatingDate=" + updatingDate +
                ", author=" + author.getId() +
                '}';
    }
}