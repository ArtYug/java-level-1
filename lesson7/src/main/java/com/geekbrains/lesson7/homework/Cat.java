package com.geekbrains.lesson7.homework;

public class Cat {
    private final String name;
    private final int appetite;

    public Cat(String name, int appetite) throws Exception {
        appetitePositive(appetite);
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println(name + " " + " ate and now he is full : " + true);
        } else {
            System.out.println(name + " " + "hungry didn't eat : " + false);
        }
    }

    public void appetitePositive(int appetite) throws Exception {
        if (appetite < 0) {
            throw new Exception("appetite can't be negative");
        }
    }

}