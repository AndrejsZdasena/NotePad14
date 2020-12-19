package com.company;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<record> records = new ArrayList<>();

    public void createPerson() {
        var person = new person();
        person.setFirstName(InputUtils.askString("First name"));
        person.setLastName(InputUtils.askString("Last name"));
        person.setPhone(InputUtils.askString("Phone"));
        person.setEmail(InputUtils.askString("E-mail"));
        records.add(person);
    }

    public void listRecords() {
        for (record rec : records) {
            System.out.println(rec);
        }
    }

    public void showHelp() {
        System.out.println("To create record type command Create");
        System.out.println("To show the list of records firstly need to create records then type command List");
        System.out.println("To close program type Exit");
    }

    public void createBook() {
        var Book = new book();
        Book.setAuthor(InputUtils.askString("Author"));
        Book.setTitle(InputUtils.askString("Title"));
        Book.setIsbn(InputUtils.askString("Isbn"));
        records.add(Book);
    }

    public void createStickyNote() {
        var Note = new note();
        Note.setText(InputUtils.askString("Enter text"));
        records.add(Note);
    }

    public void createRecurringAlarm() {
        var Alarm = new alarm();
        Alarm.setTime(InputUtils.askString("Enter time"));
        Alarm.setText(InputUtils.askString("Enter text"));
        records.add(Alarm);
    }

    public void createReminder() {
        var Reminder = new reminder();
        Reminder.setDate(InputUtils.askString("Enter date"));
        Reminder.setTime(InputUtils.askString("Enter time"));
        Reminder.setText(InputUtils.askString("Enter text"));
        records.add(Reminder);
    }
}
