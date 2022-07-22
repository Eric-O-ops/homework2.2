package com.geektech.project;

public abstract class Animal implements Printable{
    private String age;
    private String name;

    public Animal(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge());

    }
}
