package com.booleanuk;

import com.booleanuk.Person;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Ludvig", "Hanson",
                123456789, 93847322, "Experis");
        System.out.println(person.toString());
    }
}