package Lessons;

public class ParametersOfMethods {
    public static void main(String[] args) {
        Person4 person1 = new Person4();
       // person1.name = "Роман";
        person1.setNameAndAge("Игорь", 50);
        person1.speak();

        Person4 person2 = new Person4();
        String s1 = "Вова";
        person2.setNameAndAge(s1, 20);
        person2.speak();
    }
}

class Person4 {
    String name;
    int age;

    void setNameAndAge (String username, int userage) { // метод. который назначает какое-то значение нашему полю name.
        // метод принимает строку, с названием username.
        // метод может принимать любые типы данных: числа, массивы, строки и т.д. и одновременно их может быть сколько угодно
        name = username;// полю каждого объекта присвоится значение переданное в метод setName.
        age = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        String s = "Hello";
        return years;
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
