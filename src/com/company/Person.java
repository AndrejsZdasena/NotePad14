package com.company;

public class Person extends Record {

    private String firstName;
    private String phone;

    private String lastName;
    private String email;

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
        return String.format("%s First name: %s; Last name: %s; Phone: %s; E-mail: %s",str, firstName, lastName, phone, email);
    }
}
