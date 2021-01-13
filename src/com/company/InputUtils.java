package com.company;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputUtils {
    public static final String TIME_FORMAT = "HH:mm";
    public static DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    private static final Scanner scanner = new Scanner(System.in);

    public static String askString(String message) {
        System.out.println("askString() started");

        System.out.print(message + ": ");
        return scanner.next();
    }

    public static int askInt(String message) {
        System.out.println(message + ": ");
        return scanner.nextInt();
    }

    public static LocalTime askTime(String message) {
        System.out.print(message + "("+ TIME_FORMAT +") ");
        var strTime = scanner.next();
        return LocalTime.parse(strTime, TIME_FORMATTER);
    }
    public static String timetoString(LocalTime time){
        return TIME_FORMATTER.format(time);
    }

    public static LocalDate askDate(String message) {
        System.out.print(message + "("+ DATE_FORMAT +") ");
        var strDate = scanner.next();
        return LocalDate.parse(strDate, DATE_FORMATTER);
    }
    public static String datetoString(LocalDate date){
        return DATE_FORMATTER.format(date);
    }
}
