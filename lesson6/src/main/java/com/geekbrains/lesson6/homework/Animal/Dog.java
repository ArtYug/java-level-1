package com.geekbrains.lesson6.homework.Animal;


public class Dog extends Animal {

    public static int counter = 0;

    public Dog(String name, int maxDistanceForRun, int maxDistanceForSwim) {
        super(name, maxDistanceForRun, maxDistanceForSwim);
        counter++;
    }
}
