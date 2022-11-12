package com.geekbrains.lesson6.homework.Animal;


public class Cat extends Animal {
    public static int counter = 0;

    public Cat(String name, int maxDistanceForRun, int maxDistanceForSwim) {
        super(name, maxDistanceForRun, 0);
        counter++;
    }
}

