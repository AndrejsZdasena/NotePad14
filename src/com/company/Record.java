package com.company;

public abstract class Record {
    private int id;
    private static int counter = 0;

    public Record() {
        counter++;
        id = counter;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(" id : %d", id);
    }
}
