package com.masai.entity.entity;

public class Parrot extends Bird implements Flyable{
    public Parrot(String name) {
        super(name);
    }
    public Parrot(){}
    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" is roaming");
    }

    @Override
    public void makeNouse() {
        System.out.println(getName()+" is making noise");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying!!");
    }
}