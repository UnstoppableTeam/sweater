package com.example.sweater.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;

    public Message() {
    }

    public Message(String text, String tag, User user) {
        this.author = user;
        this.text = text;
        this.tag = tag;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "афффтар выпил яду";
    }

    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private String tag;
    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;
    @Setter
    @Getter
    private String filename;

}
