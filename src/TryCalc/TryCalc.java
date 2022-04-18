package TryCalc;

import java.io.IOException;
import java.util.Scanner;

public class TryCalc {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String input = scan.nextLine();
        String output = calc(input);
        System.out.println("Output: \n"+output);
    }
    public static String calc(String input2) {

        String[] math = input2.split(" ");

        if (math.length > 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Разрешено вводить не более 2 чисел и 1 операции");
            }
        }

        String number1 = math[0];
        String operation = math[1];
        String number2 = math[2];

        int x = Integer.parseInt(number1);
        int y = Integer.parseInt(number2);
        int result = 0;

        if(x<1||x>10||y<1||y>10){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Одно или несколько чисел не соответствует условию");
            }
        }
            switch (operation) {
                case "+" : result = x+y;
                break;
                case "-" : result = x-y;
                break;
                case "*" : result = x*y;
                break;
                case "/" : result = x/y;
                break;
                default:
                    System.out.println("Введена неверная мат. операция");
            }

        return Integer.toString(result);
    }



}

