package com.example.playData;

import javax.persistence.*;

@Entity
//@ToString
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String body;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
//    @NonNull
    private User user;

    public Post() {}

    public Post(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("[Post]id=%s, body=%s, author_id=%s", this.id, this.body, this.user.getId());
    }

    public Post(String body, User user) {
        this.setBody(body);
        this.setUser(user);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
