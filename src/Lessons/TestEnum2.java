package Lessons;

import java.util.Scanner;

public class TestEnum2 {
    public static void main(String[] args) {
        SeasonEnum season = SeasonEnum.AUTUMN;
        System.out.println(season.name()); // метод нейм позволяет узнать название объекта класса SeasonEnum,
        // на который ссылается наша переменная season.
        //далее метод valueOf, он используется когда мы из строки хотим получить ENUM.
        //Пример: юзер вводит время года, а мы получаем его в виде ЕНАМ и всю доп. информацию к нему (про перевод и температуру)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи время года ");
        String vvod = scanner.nextLine();
        SeasonEnum user = SeasonEnum.valueOf(vvod);
        System.out.println(user.getTranslation() + user.getTemperature());
        // метод ordinal возвращает порядок(индекс) нашего объекта в списке объектов класса ENUM
        System.out.println(season.ordinal());
    }

}


