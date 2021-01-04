package com.company;

import java.util.ArrayList;

public class Notepad {
    private final ArrayList<Record> records = new ArrayList<>();

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

}
