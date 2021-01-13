package com.company;

import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Scanner;

public class RecurringAlarm extends StickyNote {
    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; time %s", str, InputUtils.timetoString(time));

    }

    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askTime("Enter time");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.timetoString(time).toLowerCase().contains(substr);
    }

    @Override
    public void load(Scanner in) {
        super.load(in);
        //time = in.nextInt();
    }

    @Override
    public RecordType getMyType() {
        return RecordType.ALARM;
    }
    public void printToFile(PrintWriter out) {
        super.printToFile(out);
        out.println(time);
    }
}


