package Calculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean check1 = checkArab(input);
        boolean check2 = checkRom(input);
        String resultRomeToArab;
        if ((!check1)&(!check2)){
            throw new Exception();
        }
        if (check2){
            resultRomeToArab=romeToArab(input);
            String output2 = calc(resultRomeToArab);
            String resultRome = arabToRome(output2);
            System.out.println("Output: \n"+resultRome);
        }
        if (check1){
            String output = calc(input);
            System.out.println("Output: \n"+output);
        }

    }

    public static String calc(String input) throws Exception{
        String [] math = input.split(" ");
        if (math.length == 3) {
            String number1 = math[0];
            String operation = math[1];
            String number2 = math[2];

            int x = Integer.parseInt(number1);
            int y = Integer.parseInt(number2);
            int result = 0;

            if(x<1||x>10||y<1||y>10){
                throw new Exception();
            }
            switch (operation) {
                case "+": result = x+y;break;
                case "-": result = x-y;break;
                case "*": result = x*y;break;
                case "/": result = x/y;break;
                default: throw new Exception();
            }
            return Integer.toString(result);
        } else{
            throw new Exception();
        }

    }

    public static boolean checkArab(String inputArab) {
        String[] check = inputArab.split(" ");
        boolean a = true;
        boolean b = true;
        String numarab1 = check[0];
        String numarab2 = check[2];
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String x:arab) {
            a = numarab1.equals(x);
            if (a){
                break;
            }
        }
        for (String x:arab) {
            b = numarab2.equals(x);
            if (b){
                break;
            }
        }

        return a&b;
    }

    public static boolean checkRom(String inputRom) {
        String[] check = inputRom.split(" ");
        boolean a = true;
        boolean b = true;
        String numRom1 = check[0];
        String numRom2 = check[2];
        String[] rom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String x:rom) {
            a = numRom1.equals(x);
            if (a){
                break;
            }
        }
        for (String x:rom) {
            b = numRom2.equals(x);
            if (b){
                break;
            }
        }
        return a&b;
    }
    public static String romeToArab(String input){
        String[] convert = input.split(" ");
        String rim1 = convert[0];
        String rim2 = convert[2];
        Convert e1 = Convert.valueOf(rim1);
        String str1 = e1.getArab();
        Convert e2 = Convert.valueOf(rim2);
        String str2 = e2.getArab();
        String out = str1+" "+convert[1]+" "+str2;
        return out;
    }

    public static String arabToRome(String input){
        int x = Integer.parseInt(input);
        Convert c1 = Convert.values()[x-1];
        return c1.name();
    }

}

enum Convert {
    I("1"),II("2"),III("3"),IV("4"),V("5"),VI("6"),VII("7"),VIII("8"),IX("9"),X("10"),XI("11"),XII("12"),XIII("13"),XIV("14"),XV("15"),
    XVI("16"),XVII("17"),XVIII("18"),XIX("19"),XX("20"),XXI("21"),XXII("22"),XXIII("23"),XXIV("24"),XXV("25"),XXVI("26"),XXVII("27"),XXVIII("28"),XXIX("29"),
    XXX("30"),XXXI("31"),XXXII("32"),XXXIII("33"),XXXIV("34"),XXXV("35"),XXXVI("36"),XXXVII("37"),XXXVIII("38"),XXXIX("39"),XL("40"),XLI("41"),XLII("42"),XLIII("43"),
    XLIV("44"),XLV("45"),XLVI("46"),XLVII("47"),XLVIII("48"),XLIX("49"),L("50"),LI("51"),LII("52"),LIII("53"),LIV("54"),LV("55"),LVI("56"),LVII("57"),
    LVIII("58"),LIX("59"),LX("60"),LXI("61"),LXII("62"),LXIII("63"),LXIV("64"),LXV("65"),LXVI("66"),LXVII("67"),LXVIII("68"),LXIX("69"),LXX("70"),LXXI("71"),
    LXXII("72"),LXXIII("73"),LXXIV("75"),LXXV("75"),LXXVI("76"),LXXVII("77"),LXXVIII("78"),LXXIX("79"),LXXX("80"),LXXXI("81"),LXXXII("82"),LXXXIII("83"),LXXXIV("84"),LXXXV("85"),
    LXXXVI("86"),LXXXVII("87"),LXXXVIII("88"),LXXXIX("89"),XC("90"),XCI("91"),XCII("92"),XCIII("93"),XCIV("94"),XCV("95"),XCVI("96"),XCVII("97"),XCVIII("98"),XCIX("99"),
    C("100");
    String arab;

    Convert (String arabsk){
        arab = arabsk;
    }
    public String getArab(){
        return arab;
    }
}


