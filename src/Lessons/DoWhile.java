package Lessons;

import java.util.Scanner;

public class DoWhile { // наша задача: цикл будет крутиться до тех пор пока не введут необходимую цифру.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 5");
        int chislo = scanner.nextInt(); // введенное число записывается в переменную chislo
        while (chislo!=5) {  //пока chislo не равно 5, цикл просит ввести 5
                            // и передает введенное значение в переменную chislo.
            System.out.println("Введи 5");
            chislo = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");
    }
}

// в описанном выше способе наблюдается дублирование кода, что не оч хорошо. второй вариант булее презентабельный

/* class DoWhile2{
    Scanner scan = new Scanner(System.in);
        int value;
    do{
        System.out.println("Введи 5");
        value = scan.nextInt();
    } while(value!=5);
}

 */
