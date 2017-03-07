package com.lynda.tests.o301.StaticTest.olives;

public class Olive {

    private static int idCounter = 1;

    private int id;
    private OliveName name;
    private OliveColor color = OliveColor.BLACK;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Olive(){
        this.name = OliveName.KALAMATA;
        this.color = OliveColor.BLACK;
        this.id = idCounter;
        idCounter++;
    }

    public Olive(OliveName name, OliveColor color) {
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

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("This is number ")
                .append(this.getId())
                .append(". ")
                .append(this.getName())
                .append(" olive and it's colour is ")
                .append(this.getColor())
                .append(".");
        return stringBuilder.toString();
    }
}
