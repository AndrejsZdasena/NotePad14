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

    public static void createRecord() {


        for (RecordType s : RecordType.values()
        ) {
            s.printHelp();
        }

        while (true) {
            try {
                var strType = InputUtils.askString("Type");
                var type = RecordType.valueOf(strType);
                notepad.createRecord(type);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Unknown record type");
                for (RecordType s : RecordType.values()
                ) {
                    s.printHelp();
                }
            }
        }

    }


    private static void showHelpForCreate() {
        System.out.println("Commands");
        System.out.println("Create - add record");
        System.out.println("List - show created records");
        System.out.println("Exit - close program");
    }

}
