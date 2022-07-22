package com.geektech.project;

public class Cat extends Animal{
    private String hearing;

    public Cat(String age, String name, String hearing) {
        super(age, name);
        this.hearing = hearing;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( hearing + "\n___________________________________");

    }
}
