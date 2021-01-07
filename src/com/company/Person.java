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
        return String.format("%s First name: %s; Last name: %s; Phone: %s; E-mail: %s", str, firstName, lastName, phone, email);
    }

    @Override
    public void askData() {
        firstName = InputUtils.askString("Enter name");
        phone = InputUtils.askString("Enter phone");
        lastName = InputUtils.askString("Enter last name");
        email = InputUtils.askString("Enter email");
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.contains(substr)
                || phone.contains(substr)
                || lastName.contains(substr)
                || email.contains(substr);
    }
}
