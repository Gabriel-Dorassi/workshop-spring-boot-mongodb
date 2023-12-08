package com.gabriel.workshopmongo.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String Id;
    private String name;
    private String email;

    public void setId(String id) {
        Id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public User() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public User(String id, String email, String name) {
        super ();
        Id = id;
        this.email = email;
        this.name = name;
    }
}
