package Lessons;

public class Methods {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.name = "Роман";
        person1.age = 50;
        //System.out.println("Меня зовут "+ person1.name +", и мне "+ person1.age +" лет");
// Это действие по выводу на экран имени и возраста мы можем поместить в метод класса Person2,
// чтобы все объекты класса Person2 могли выводить эту инфу о себе. Создаем метод speak в классе Person
// и вызываем его в методе main
        person1.speak(); // методы можно вызывать сколько угодно раз

        Person2 person2 = new Person2();
        person2.name = "Вова";
        person2.age = 20;
       // System.out.println("Меня зовут "+ person2.name +", и мне "+ person2.age +" лет");
        person2.sayHello();
    }
}

class Person2{
    String name;
    int age;
    void speak() { // Создаем метод спик для всех объектов класса
        for (int i = 0; i < 3; i++) { // запускаем цикл фор на выполнение действия несколько раз,
            // в данном случае 3 раза.
            System.out.println("Меня зовут " + name + ", и мне " + age + "лет");
        }
    }
    void sayHello() {
            System.out.println("Hello");
    }

}

