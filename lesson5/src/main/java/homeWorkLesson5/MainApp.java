package homeWorkLesson5;

public class MainApp {

//                   Домашнее задание.Урок номер 5.
//   1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//   2. Конструктор класса должен заполнять эти поля при создании объекта.
//   3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//   4. Создать массив из 5 сотрудников.
//   5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person("Ivan ", " Ivanov ", " Engineer", "iviivan@gmail.com", 89756456, 9000, 33),
                new Person("Valera", "Valerov", "Engineer", "valivan@gmail.com", 89754546, 7000, 24),
                new Person("Gurgen", "Gurvano", "Engineer", "gividiviivan@gmail.com", 89769456, 9000, 43),
                new Person("John", "Johnson", "Engineer", "johnfvan@gmail.com", 89756456, 9000, 41),
                new Person("Rose", "DangerousNamajunas", "UfcFighter", "iviivan@gmail.com", 89756456, 11000, 29),
        };

        for (Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}
