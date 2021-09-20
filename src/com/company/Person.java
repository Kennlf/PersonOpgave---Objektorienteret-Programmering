package com.company;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;
        }

    public int getAge(){
        return age;
    }

    public void hasBirthday(){
        age++;
    }
    public String toString(){
        return "[Alder: " + age + " " + " " + "Navn: " + name + ']';

    }

}
