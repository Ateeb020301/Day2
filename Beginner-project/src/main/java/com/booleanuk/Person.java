package com.booleanuk;

public class Person {
    private String firstName;
    private String lastName;
    private int SoSecNumber;
    private int phoneNumber;
    private String workplace;

    public Person(String firstName, String lastName, int soSecNumber, int phoneNumber, String workplace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SoSecNumber = soSecNumber;
        this.phoneNumber = phoneNumber;
        this.workplace = workplace;
    }

    public int getSoSecNumber() {
        return SoSecNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getWorkplace() {
        return workplace;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSoSecNumber(int soSecNumber) {
        SoSecNumber = soSecNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
    @Override
    public String toString() {
        return "My name is " + getFirstName() + " " + getLastName() + ". \n" +
                "My social security number is " + getSoSecNumber() + " and my phonenumber is " +
                getPhoneNumber() + ". \nI work for " + getWorkplace() + ".";
    }
}

