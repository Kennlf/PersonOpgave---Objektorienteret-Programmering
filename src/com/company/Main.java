package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Kenneth", 29);
        String name = person.getName();
        System.out.println(name);
        int age = person.getAge();
        System.out.println(age);

        System.out.println(person);
        person.hasBirthday();
        System.out.println(person);
        person.hasBirthday();
        System.out.println(person);
    }
}
