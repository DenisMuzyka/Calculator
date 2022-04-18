package Lessons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

// Рассматриваем разные ситуации исключений
public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
            //  } catch (IOException e) {         Если мы хотим обработать все Экзепшн одинаково,
            //      e.printStackTrace();          то используем мульти-catch блок. Ниже:
            //  } catch (ParseException e) {
            //      e.printStackTrace();
            //  } catch (IllegalAccessException e) {
            //      e.printStackTrace();

      //  } catch (IOException | ParseException | IllegalAccessException e) {
      //      e.printStackTrace();
            // Исключения могут быть наследованы друг от друга, но все они наследуются от класса-Родителя Exeption.
            // Поэтому мы можем записать обработку всех наших исключений способом ниже:
        } catch (Exception e) { // После этой обработки исключения, другие блоки обработки наших исключений нет смысла добавлять, т.к. все обработается в этом блоке.

        }

    }
    public static void run () throws IOException, ParseException, IllegalAccessException {
            // В одном методе можно выбросить несколько разных исключений. Если мы их не обработали в этом методе, то надо их обработать в том методе где вызовем метод RUN.

    }

}