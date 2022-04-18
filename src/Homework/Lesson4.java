package Homework;


public class Lesson4{

}


class Student {

    int markEconomy;
    int markForLang;
    int markMath;

    int averageMark(int markEconomy, int markForLang, int markMath) {
        this.markMath = markMath;
        this.markForLang = markForLang;
        this.markEconomy = markEconomy;
        int result = (markEconomy + markForLang + markMath)/3;
        return result;
    }
}

class StudentTest {


    public static void main(String[] args) {

        Student st1 = new Student();

        System.out.println(st1.averageMark(10,8,7));

    }

}