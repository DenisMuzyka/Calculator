package Lessons;

public class WhileLoop {
    public static void main(String[] args) {

        int value = 0;
        while (value<5) {    // выполняется до тех пор пока условие выдает значение true
            System.out.println("Hello " +value);
            value=value+1;
        }

    }
}
