package com.example.project;

import androidx.annotation.NonNull;

public class Pyramid {
    private String id;
    private String name;
    private String company;
    private String location;

    public String getName(){
        return name;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s located in %s, built by %s", name, location, company);
    }
}
