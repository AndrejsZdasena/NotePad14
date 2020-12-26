package com.company;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createRecord(RecordType recordType) {
        var rec = recordType.createRecord();
        //processRecord(rec);
        rec.askData();
        records.add(rec);
        System.out.println("Created:" + rec);
    }
    public void choosePet(Species species) {
        var rec = species.choosePet();
        //processRecord(rec);
        rec.askData();
        records.add(rec);
        System.out.println("Created:" + rec);
    }
    /*private void processRecord(Record rec) {
        rec.askData();
        records.add(rec);
        System.out.println("Created:"+rec);*/

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);
        }
    }

    public void showHelp() {
        System.out.println("To create record type command Create");
        System.out.println("To show the list of records firstly need to create records then type command List");
        System.out.println("To close program type Exit");
    }
}
