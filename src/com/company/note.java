package com.company;

public class note extends record {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString(){
        var str = super.toString();
        return String.format("%s; text %s",str, text);
    }
}
