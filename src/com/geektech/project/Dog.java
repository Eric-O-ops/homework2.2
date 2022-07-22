package com.geektech.project;

public class Dog extends Animal{
    private String sniff;

    public Dog(String age, String name, String sniff) {
        super(age, name);
        this.sniff = sniff;
    }


    @Override
    public void print() {
        super.print();
        System.out.println(sniff + "\n___________________________________");
    }
}
