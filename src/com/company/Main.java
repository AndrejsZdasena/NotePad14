package com.company;

public class Main {
    private static final Notepad notepad = new Notepad();

    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            showHelpForCreate();
            var cmd = InputUtils.askString("Enter command");
            System.out.println();
            switch (cmd) {
                case "List":
                    listRecords();
                    break;
                case "Create":
                    createRecord();
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
        showHelpForType();
        var strType = InputUtils.askString("Type");
        var type = RecordType.valueOf(strType);
        notepad.createRecord(type);

    }

    private static void showHelpForCreate() {
        System.out.println("Commands");
        notepad.showHelpForCreate();
    }

    private static void showHelpForType() {
        System.out.println("Types - write with capslock: \n");
        notepad.showHelpForType();
    }
}
