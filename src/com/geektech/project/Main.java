package com.geektech.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Cow").print();


    }
    public static Animal createObject(String className){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add name of " + className);
        String name = scanner.nextLine();
        System.out.println("Add age of " + className);
        String age = scanner.nextLine();
        Animal animal = null;
        switch (className){
            case "Dog":
                System.out.println("Describe sniff of Dog (e.g has good sniff or don't)");
                String sniff = scanner.nextLine();
                Dog dog = new Dog(age, name, sniff);
                animal = dog;
                break;
            case "Cat":
                System.out.println("Describe hearing of Cat (e.g has good hearing or don't)");
                String hearing = scanner.nextLine();
                Cat cat = new Cat(age, name, hearing);
                animal = cat;
                break;
            case "Cow":
                System.out.println("Describe hoves of Dog (e.g has hooves or has some trouble )");
                String hooves  = scanner.nextLine();
                Cow cow = new Cow(age, name, hooves);
                animal = cow;
                break;
        }
        return animal;

    }
}