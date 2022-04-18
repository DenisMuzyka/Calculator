package Lessons;
// В этом уроке мы рассмотрим Классы и объекты класса с зададим им поля.
public class ClassesAndObjects { //Публ. класс может быть только 1.Вспомогательных сколько угодно.

    public static void main(String[] args) {
// из нашего абстрактного класса Person создадим несколько конкретных объектов с его полями(имя возраст)
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут "+ person1.name +", и мне "+ person1.age +" лет");

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        System.out.println("Меня зовут "+ person2.name +", и мне "+ person2.age +" лет");
    }
}

class Person{
    // У класса могут быть 1. Данные (поля) 2. Действия, к. он может совершать (методы)
    String name;
    int age;
}