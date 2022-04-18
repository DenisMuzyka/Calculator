package Lessons;
// В этом уроке рассмотрим типы возвращаемого значение методов.
// void - метод не передает никаких значений в метод main.
public class TypeOfMethods {
    public static void main(String[] args) {
        Person4 person1 = new Person4();
        person1.name = "Роман";
        person1.age = 50;
        int year1 = person1.calculateYearsToRetirement(); // создаем переменную, которой присваиваем значение,
        // полученное в результате работы метода calculate...
        System.out.println("Первому человеку до пенсии "+ year1 +" лет");
        Person4 person2 = new Person4();
        person2.name = "Вова";
        person2.age = 20;
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Второму человеку до пенсии "+ year2 +" лет");

    }
}

class Person3{
    String name;
    int age;

    int calculateYearsToRetirement(){ // будем считать количество лет у человека до пенсии
        int years = 65-age;
        String s = "Hello"; // мы не можем из этого метода вернуть переменную s, т.к. в типе возвращаемого значения у метода стоит Int
        return years; // сразу как только программа в методе натыкается на return, она выходит из этого метода
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", и мне " + age + "лет");
        }
    }
    void sayHello() {
        System.out.println("Hello");
    }
}
