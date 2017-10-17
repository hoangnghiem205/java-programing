package com.java.lesson8;

public class Rectangle implements IShape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return this.width * this.height;
    }

    @Override
    public float calculate() {
        return 0;
    }
}
