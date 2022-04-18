package Lessons;



public class TestEnum {
    public static void main(String[] args) {
        SeasonEnum season = SeasonEnum.SUMMER; // переменная season ссылается на объект AUTUMN енама SeasonsEnum.

        switch (season) {
            case SUMMER: System.out.println("НА улице тепло"); break;
            case WINTER: System.out.println("НА улице холодно"); break;
        }
        // Иерархия енама, наследование. Object -> Enum -> Season
        System.out.println(season instanceof SeasonEnum); // так можно проверить. является ли наш объект season
        // обектом енама SeasonEnum. результат вывода TRUE.
        System.out.println(season instanceof Enum); // проверяем является ли наш объект объектом класса ENUM,
        // т.е. родительского класса. результат вывода TRUE.
        // Отсюда вывод, что все методы родительских классов будут работать с нашим объектом season.
        System.out.println(season.getClass());

        System.out.println(season.getTranslation());
        SeasonEnum season2 = SeasonEnum.WINTER;
        System.out.println(season2.getTemperature());
    }
}
// далее рассмотрим несколько полезных методов доступных для объектов класса Enum. Файл TestEnum2.