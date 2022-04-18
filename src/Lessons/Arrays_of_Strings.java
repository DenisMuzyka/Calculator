package Lessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {

       int[] numbers = new int[5];

    String[] strings = new String[3];
       strings[0] = "Привет";
       strings[1] = "Пока";
       strings[2] = "джава";
      for(int i=0;i<strings.length;i++){    // проходит по каждому элементу массива и печатает его
          System.out.println(strings[i]);
      }
        for(String str:strings) {  // делает тоже самое цикл for each (для каждого) элемента массива strings
            System.out.println(str);
        }

        int [] num1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int summ = 0;
        for(int x:num1){
            summ=summ+x;
        }
        System.out.println(summ);  // сумма всех чисел массива num1
    }

}
