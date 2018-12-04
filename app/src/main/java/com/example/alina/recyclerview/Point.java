package com.example.alina.recyclerview;

public class Point {

    private String name;
    private String distance;
    private boolean isAvailable;

    public Point(String name, String distance, boolean isAvailable) {
        this.name = name;
        this.distance = distance;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return this.distance;
    }

    public void setDistance(String company) {
        this.distance = company;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}