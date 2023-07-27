package com.example.skypro.algoritms.Potter;

import java.util.Objects;

public class Potion {
    private String name;

    public Potion(String name) {
        this.name = name;
    }
    public Potion(Potion source) {
        this.name = source.name;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean equals(Object other) {
        if(!other.getClass().equals(this.getClass())){
            return false;
        }
        return ((Potion)other).name.equals(name);
    }

}
