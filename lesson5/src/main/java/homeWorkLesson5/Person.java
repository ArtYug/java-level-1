package homeWorkLesson5;
public class Person {

    private final String name;
    private final String surname;
    private final String position;
    private final String email;
    private final int phoneNumber;
    private final int salary;
    private final int age;

    public Person(String name, String surname, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", phone number : " + phoneNumber +
                ", salary = " + salary +
                ", age = " + age +
                '}';
    }
}
