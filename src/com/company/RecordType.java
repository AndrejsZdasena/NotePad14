package com.company;

public enum RecordType {
    PERSON {
        @Override

        public Record createRecord() {

            return new Person();
        }

        @Override
        public void printHelp() {
            System.out.println("PERSON - add person records");
        }

    },
    BOOK {
        @Override
        public Record createRecord() {
            return new Book();
        }

        @Override
        public void printHelp() {
            System.out.println("BOOK - add book records");
        }

    },
    NOTE {
        @Override
        public Record createRecord() {
            return new StickyNote();
        }

        @Override
        public void printHelp() {
            System.out.println("NOTE - add note records");

        }

    },
    ALARM {
        @Override
        public Record createRecord() {
            return new RecurringAlarm();
        }

        @Override
        public void printHelp() {
            System.out.println("ALARM - add time records");
        }

    },
    REMINDER {
        @Override
        public Record createRecord() {

            return new Reminder();
        }

        @Override
        public void printHelp() {
            System.out.println("REMINDER - add time records");
        }

    },
    PET {
        @Override
        public Record createRecord() {

            return new Pet();

        }

        @Override
        public void printHelp() {
            System.out.println("PET - add pet's name and species");
        }
    };

    public abstract Record createRecord();
    public abstract void printHelp();

}
