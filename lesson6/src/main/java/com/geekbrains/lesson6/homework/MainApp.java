package com.geekbrains.lesson6.homework;

import com.geekbrains.lesson6.homework.Animal.Animal;
import com.geekbrains.lesson6.homework.Animal.Cat;
import com.geekbrains.lesson6.homework.Animal.Dog;

//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//        препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//        dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//        кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.



public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 200, 0),
                new Cat("Murzik", 200, 0),
                new Cat("Matilda", 200, 0),
                new Cat("Atos", 200, 0),
                new Cat("Leopold", 200, 0),
                new Dog("Boomer", 500, 10),
                new Dog("Bo", 500, 10),
                new Dog("Jasper", 500, 10),
                new Dog("lucky", 500, 10),

        };
        for (Animal o : animals) {
            o.run(200);
            o.swim(8);
        }
        System.out.println("Animal count : " + Animal.counter);
        System.out.println("Cats count : " + Cat.counter);
        System.out.println("Dog count : " + Dog.counter);
    }
}
