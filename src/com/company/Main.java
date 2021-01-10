package com.company;



public class Main {
    private static final Notepad notepad = new Notepad();
    public static void main(String[] args) {

        notepad.loadRecords();

        boolean running = true;
        while (running) {
            showHelpForCreate();
            var cmd = InputUtils.askString("Enter command");
            System.out.println();
            switch (cmd) {
                case "list":
                    listRecords();
                    break;
                case "create":
                    createRecord();
                    break;
                case "delete":
                    deleteRecord();
                    break;
                case "find":
                    findRecord();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        notepad.saveRecords();
        System.out.println("Good bye");
    }


    private static void deleteRecord() {
        int id;
        id = InputUtils.askInt("Enter id");
        notepad.deleteRecord(id);
    }

    private static void findRecord() {
        var substr = InputUtils.askString("Enter name");
        notepad.findRecord(substr);
    }

    private static void listRecords() {
        notepad.listRecords();
    }



    public static void createRecord() {

        System.out.println("Main.createRecord() started");

        for (RecordType s : RecordType.values()
        ) {
            s.printHelp();
        }

        while (true) {
            try {
                String strType;
                strType = InputUtils.askString("Type");
                RecordType type = RecordType.valueOf(strType);
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
        System.out.println("create - add record");
        System.out.println("delete - delete record");
        System.out.println("find - find created records");
        System.out.println("list - show created records");
        System.out.println("exit - close program");
    }

}
