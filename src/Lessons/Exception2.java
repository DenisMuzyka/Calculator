package Lessons;

import java.io.IOException;
import java.util.Scanner;

/* Это урок по выбрасыванию исключений. Моделируем ситуацию, когда юзер вводит числа в строку
и если число отлично от 0, то будем выбрасывать исключение.
 */
public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x!=0) { /* в этом блоке программы мы выбрасываем исключение, которое появится при
            введенном числе не равно 0. Вид: throw new (тип исключения для нашего случая гуглим) */
                try {
                    throw new IOException(); //т.к. в нашем методе мы выбрас Эксепшн, то в сигнатуру метода мы должны добавить throws наш тип экзекшн. / либо обработать это исключение самим через try/catch.
                } catch (IOException e) {
                    System.out.println("Пользователь ввел что-то вместо 0");
                }

            }
        }
    }
}
// Если мы не нашли подходящий нам тип исключения, то мы можем создать свой тип исключения, далее см. java file ScannerException