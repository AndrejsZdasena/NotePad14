package com.company;

public class reminder extends alarm {
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString(){
        var str = super.toString();
        return String.format("%s; date %s",str, date);
    }
}
