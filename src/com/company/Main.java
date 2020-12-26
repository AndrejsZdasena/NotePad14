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
        var strType = InputUtils.askString("Type");
        var type = RecordType.valueOf(strType);
        var strType1 = InputUtils.askString("Choose pet");
        var species = Species.valueOf(strType1);
        notepad.createRecord(type);
        notepad.choosePet(species);
    }
    /*private static void choosePet(){
        var strType = InputUtils.askString("Pet");
        var pet = Species.valueOf(strType);
        notepad.createRecord(pet);
    }*/

    private static void showHelp() {
        System.out.println("This is very helpfull\n");
        notepad.showHelp();
    }
}
