package com.example.blog.vo;

import lombok.Data;

@Data
public class member {

    private int id;
    private String name;
    private String email;

    public member(){    }

    public member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
