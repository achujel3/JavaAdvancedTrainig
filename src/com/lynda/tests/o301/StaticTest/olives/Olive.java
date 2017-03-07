package com.lynda.tests.o301.StaticTest.olives;

public class Olive {

    public static final long BLACK = 0x000000;

    private String name;
    private long color = BLACK;

    Olive(String name, long color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }
}
