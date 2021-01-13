package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class StickyNote extends Record {
    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; text %s", str, text);
    }

    @Override
    public void askData() {
        text = InputUtils.askString("Enter text");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || text.contains(substr);
    }

    @Override
    public void load(Scanner in) {
       super.load(in);
       text = in.next();
    }

    @Override
    public RecordType getMyType() {
        return RecordType.NOTE;
    }
    public void printToFile(PrintWriter out) {
        super.printToFile(out);
        out.println(text);
    }
}
