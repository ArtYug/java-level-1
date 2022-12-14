package com.geekbrains.lesson7.homework;

//                              Домашнее задание номер 7.
//        Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
//        1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//        (например, в миске 10 еды, а кот пытается покушать 15-20).
//        2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//        удалось покушать (хватило еды), сытость = true.
//        3. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//        наполовину сыт (это сделано для упрощения логики программы).
//        4. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//        потом вывести информацию о сытости котов в консоль.
//        5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


public class MainClass {
    public static void main(String[] args) throws Exception {

        Plate plate = new Plate(300);
        plate.info();
        Cat[] cats = {
                new Cat("Barsik", 95),
                new Cat("Bars", 9),
                new Cat("Bar", 85),
                new Cat("Ba", 78),
                new Cat("B", 98),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }
        plate.setFood(200);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }
    }
}