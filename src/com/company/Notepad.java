package com.company;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createPerson() {
        var person = new Person();
        person.setFirstName(InputUtils.askString("First name"));
        person.setLastName(InputUtils.askString("Last name"));
        person.setPhone(InputUtils.askString("Phone"));
        person.setEmail(InputUtils.askString("E-mail"));
        records.add(person);
    }

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

    public void createBook() {
        var book = new Book();
        book.setAuthor(InputUtils.askString("Author"));
        book.setTitle(InputUtils.askString("Title"));
        book.setIsbn(InputUtils.askString("Isbn"));
        records.add(book);
    }

    public void createStickyNote() {
        var note = new StickyNote();
        note.setText(InputUtils.askString("Enter text"));
        records.add(note);
    }

    public void createRecurringAlarm() {
        var alarm = new RecurringAlarm();
        alarm.setTime(InputUtils.askString("Enter time"));
        alarm.setText(InputUtils.askString("Enter text"));
        records.add(alarm);
    }

    public void createReminder() {
        var reminder = new Reminder();
        reminder.setDate(InputUtils.askString("Enter date"));
        reminder.setTime(InputUtils.askString("Enter time"));
        reminder.setText(InputUtils.askString("Enter text"));
        records.add(reminder);
    }
}
