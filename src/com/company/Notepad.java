package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;


public class Notepad {
    private final ArrayList<Record> records = new ArrayList<>();
    private final File loadRecordsFile = new File("records.txt");

    public void createRecord(RecordType recordType) {
        System.out.println("Notepad.createRecord() started");

        Record rec = recordType.createRecord();
        rec.askData();
        records.add(rec);
        System.out.println("Created:" + rec);
    }


    public void loadRecords() {
        try (var in = new Scanner(loadRecordsFile)) {
            while (in.hasNextLine()) {

                String strType = in.nextLine();
                RecordType type = RecordType.valueOf(strType);
                var rec = type.createRecord();
                rec.load(in);
                records.add(rec);


            }

        } catch (FileNotFoundException e) {
            System.out.println("Cannot read leaderboard");
        }
    }

    public void saveRecords() {
        try (var out = new PrintWriter(loadRecordsFile)) {
            for (Record rec : records
            ) {
                out.print(rec.getMyType());
                rec.printToFile(out);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Cannot save leaderboard");
        }
    }


    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);
        }
    }

    public void findRecord(String substr) {
        for (Record rec : records) {
            if (rec.contains(substr)) {
                System.out.println(rec);
            }
        }
    }

    public void deleteRecord(int id) {
        for (int i = 0; i < records.size(); i++) {
            Record rec;
            rec = records.get(i);
            if (rec.getId() == id) {
                records.remove(i);
                break;
            }
        }
    }
}
