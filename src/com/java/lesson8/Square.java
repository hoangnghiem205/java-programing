package com.java.lesson8;

public class Square implements IShape, ICar {
    private float edge;

    public Square(float edge) {
        this.edge = edge;
    }

    public float getEdge() {
        return edge;
    }

    public void setEdge(float edge) {
        this.edge = edge;
    }

    @Override
    public float calculateArea() {
        return this.edge * this.edge;
    }

    @Override
    public float calculate() {
        return 0;
    }
}
