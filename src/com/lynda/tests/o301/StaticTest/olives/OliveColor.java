package com.lynda.tests.o301.StaticTest.olives;

public enum OliveColor {

    BLACK("0x000000"), GREEN("0x00FF00");

    private String color;

    private OliveColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
