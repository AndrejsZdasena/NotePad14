package com.company;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Reminder extends RecurringAlarm {
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; date %s", str, InputUtils.datetoString(date));
    }

    @Override
    public void askData() {
        super.askData();
        date = InputUtils.askDate("Enter data");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.datetoString(date).toLowerCase().contains(substr);
    }

    @Override
    public void load(Scanner in) {
        super.load(in);

    }

    @Override
    public RecordType getMyType() {
        return RecordType.REMINDER;
    }
    public void printToFile(PrintWriter out) {
        super.printToFile(out);
        out.println(date);
    }
}
