package com.health.my_heart.domain.model;

public class Category {
    private final String id;
    private final String name;

    public Category() {
        id = "";
        name = "";
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
