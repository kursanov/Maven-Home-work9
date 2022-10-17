package com.peaksoft;

public class Person  {
    private String animal;
    private String name;
    private int age;

//    public Person(String animal, String name, int age) {
//        this.animal = animal;
//        this.name = name;
//        this.age = age;
//    }
    public void method(){
        System.out.println("Bul atty jaktyrat");
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
