package com.example.project;

import androidx.annotation.NonNull;

public class Temple {
    private String id;
    private String name;
    private String company;
    private String location;

    @NonNull
    @Override
    public String toString() {
        return String.format("%s located in %s, build by %s", name, location, company);
    }
}
