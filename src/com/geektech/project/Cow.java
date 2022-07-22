package com.geektech.project;

public class Cow extends Animal{
    private String hooves;

    public Cow(String age, String name, String hooves) {
        super(age, name);
        this.hooves = hooves;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( hooves + "\n___________________________________");
    }
}
