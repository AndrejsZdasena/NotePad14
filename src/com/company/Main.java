package com.company;

public class Main {
    private static final Notepad notepad = new Notepad();

    public static void main(String[] args) {
        showHelp();
        boolean running = true;
        while (running) {
            var cmd = InputUtils.askString("Enter command");
            switch (cmd) {
                case "List":
                    listRecords();
                    break;
                case "Create":
                    createRecord();
                    break;
                case "Help":
                    showHelp();
                    break;
                case "Exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        System.out.println("Good bye");
    }

    private static void listRecords() {
        notepad.listRecords();
    }

    private static void createRecord() {
        var type = InputUtils.askString("Type");
        switch (type) {
            case "person":
                notepad.createPerson();
                break;
            case "book":
                notepad.createBook();
                break;
            case "note":
                notepad.createStickyNote();
                break;
            case "alarm":
                notepad.createRecurringAlarm();
                break;
            case "reminder":
                notepad.createReminder();
                break;
            default:
                System.out.println("Unknown command");
        }

    }

    private static void showHelp() {
        System.out.println("This is very helpfull\n");
        notepad.showHelp();
    }
}
