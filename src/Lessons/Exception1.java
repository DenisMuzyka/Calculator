package Lessons;
/* Когда в ходе работы программы может быть обнаружена ошибка,  для обработки таких случаев используют исключения.
Это УРОК обработки исключений.
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {  // добавлена обработка исключений на программном уровне. через блок try/ catch мы обрабатываем исключение САМИ
        File file = new File("fsadf");
        try {
            Scanner scanner = new Scanner(file);
            // в блоке try мы получаем объект класса FileNotFoundException и "выбрасываем/информируем о нем".
        } catch (FileNotFoundException e) {  /* в блоке catch мы его ловим и вызываем метод printStackTrace,
         который выводит в консоль сообщение об ошибке. но мы можем этот метод заменить
         на свой способ вывода исключения, например через метод printLn с нашим текстом. */

 //           e.printStackTrace();
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");
    }



}
