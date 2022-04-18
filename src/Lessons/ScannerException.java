package Lessons;

public class ScannerException extends Exception {/* по умолчанию класса "ScannerException" не существует и нам надо унаследоваться от класса Exception.
Мы уже можем этот тип исключения "ScannerException" использовать в нашем предыдущем java файле Exception2 и
заменить там тип IOException на ScannerException. */
    public ScannerException(String description) { /* теперь мы можем передать строку в аргумент нашего исключения, которая будет выводиться при выбросе исключения.
    пример: throw new ScannerException("Пользователь ввел что-то кроме нуля"). Правда этот текст отобразится в красном тексте экзепшена */
        super(description);
    }

}
