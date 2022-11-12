package com.geekbrains.lesson7.homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int setFood(int food) {
        if (food < 0) {
            System.out.println("number can't be less 0");
            return 0;
        } else {
            this.food = food + this.food;
        }
        return food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            System.out.println("there is not enough food");
            return false;
        }
    }

    public void info() {
        System.out.println("plate :" + food + " " + "Total");
    }

}

