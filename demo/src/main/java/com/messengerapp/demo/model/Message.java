package com.messengerapp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private long id;
    private String content;
    private Date created;
    private String author;

    public Message(long id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}
