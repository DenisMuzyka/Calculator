package Lessons;

import java.util.Scanner;

public class EnterData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   /* в параметры класса сканер должны задать входящий поток.
                                            System.in - это и есть входящий поток (вводимые данные с консоли). */
        System.out.println("Введите что-нибудь и нажмите enter");
        String str = scan.nextLine();  /* у объекта класса Сканнер вызвали метод некстлайн,
                                         кот. считает с клавиатуры введенную строку
                                         в переменной str хранится то, что ввели с клав.*/
        System.out.println("Вы ввели \n" +str);


        int x = scan.nextInt(); // переменной х присвоится введенное целое число.
        System.out.println("Вы ввели "+x);

        String s = scan.next(); // присвоится значение введенное до первого пробела.


    }
}
