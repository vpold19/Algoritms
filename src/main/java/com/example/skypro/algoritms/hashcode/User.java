package com.example.skypro.algoritms.hashcode;

import java.util.Objects;

public class User {
    private final int id;
    private final String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
