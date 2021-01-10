package com.company;

import java.util.Scanner;

public abstract class Record {
    private final int id;
    private static int counter = 0;


    public Record() {
        System.out.println("Record() id started");

        counter++;
        id = counter;

    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        System.out.println("Override toString() started");

        return String.format(" id : %d", id);

    }

    public abstract void askData();

    static {
        System.out.println("Record.askdata() started");
    }

    //public abstract void loadData();


    public boolean contains(String substr) {
        var strId = String.valueOf(id);
        return strId.contains(substr);
    }


    public abstract void load(Scanner in);
}
