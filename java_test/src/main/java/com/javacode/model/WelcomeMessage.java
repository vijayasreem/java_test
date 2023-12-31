package com.javacode.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WelcomeMessage {

    @Id
    private Integer id;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}