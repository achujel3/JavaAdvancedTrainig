package com.lynda.tests.o301.StaticTest.olives;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIO("Ligurio"), PICHOLINE("Picholine"), GOLDEN("Golden");

    private String name;

    private OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
