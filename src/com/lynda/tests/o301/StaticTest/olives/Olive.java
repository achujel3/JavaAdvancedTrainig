package com.lynda.tests.o301.StaticTest.olives;

public class Olive {

    public static final long BLACK = 0x000000;
    private static int idCounter = 1;

    private int id;
    private OliveName name;
    private long color = BLACK;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Olive(OliveName name, long color) {
        this.name = name;
        this.color = color;
        this.id = idCounter;
        idCounter++;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }
}
