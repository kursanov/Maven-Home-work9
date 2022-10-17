package com.peaksoft;

public class Horse implements Animals{
    @Override
    public void animalPlus() {
        System.out.println("At adamdyn kanaty");
    }

    @Override
    public void animalMinus() {
        System.out.println("Attyn mmibus jagy jok");

    }

    private String breed;
    private String color;
    private String nickname;
    private int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

