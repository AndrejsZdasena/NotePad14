package com.company;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createRecord(RecordType recordType) {
        var rec = recordType.createRecord();
        rec.askData();
        records.add(rec);
        System.out.println("Created:" + rec);
    }

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);
        }
    }

    public void showHelpForCreate() {
        System.out.println("Create - add record");
        System.out.println("List - show created records");
        System.out.println("Exit - close programm");
    }

    public void showHelpForType() {
        System.out.println("BOOK - add book records");
        System.out.println("PERSON - add person records");
        System.out.println("ALARM - set time ");
        System.out.println("NOTE - add notes");
        System.out.println("REMINDER - set date");
        System.out.println("PET - add name and species");
    }
}
