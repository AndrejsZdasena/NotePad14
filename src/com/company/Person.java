package com.company;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import static com.company.InputUtils.*;

public class Person extends Record {

    private String firstName;
    private String phone;
    private LocalDate birthdate;
    private String lastName;
    private String email;

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s First name: %s; Last name: %s; Phone: %s; E-mail: %s; Birthdate: %s", str, firstName, lastName, phone, email, datetoString(birthdate));
    }

    @Override
    public void askData() {
        firstName = askString("Enter name");
        phone = askString("Enter phone");
        lastName = askString("Enter last name");
        email = askString("Enter email");
        birthdate = askDate("Enter birthday");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.contains(substr)
                || phone.contains(substr)
                || lastName.contains(substr)
                || email.contains(substr)
                || datetoString(birthdate).toLowerCase().contains(substr);
    }

    @Override
    public void load(Scanner in) {
        super.load(in);
        firstName = in.next();
        phone = in.next();
        lastName = in.next();
        email = in.next();
        //datetoString(birthdate).toString() = in.next();
    }

    @Override
    public RecordType getMyType() {
        return RecordType.PERSON;
    }
    public void printToFile(PrintWriter out) {
        super.printToFile(out);
        out.print(firstName);
        out.print(phone);
        out.print(lastName);
        out.print(email);
        out.print(birthdate.toString());
    }
}
