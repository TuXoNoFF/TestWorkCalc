import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение в формате два операнда и один оператор (+, -, /, *) через пробел");
        String input = scan.nextLine();

        String otvet = calc(input);
        System.out.println(otvet);

    }

    public static String calc(String input) {
        String[] razdelenie = input.split(" ");

        if (razdelenie.length < 3) {
            return "throws Exception //т.к. строка не является математической операцией";
        }


        try {
            if (razdelenie.length == 3) {

                String one = razdelenie[0];
                String two = razdelenie[2];
                String operator = razdelenie[1];

                String one1 = isRoman(one); //проверяем на римские цифры
                String two2 = isRoman(two);
                String ara1 = isArab(one);
                String ara2 = isArab(two);

//                if (!one1.equals("-1")) {  //если первое число это римская цифра от 1 до 10
//                }
                if (!two2.equals("-1")) {  //и если второе число это римская цифра от 1 до 10
                    String result = logicRimCalc(input); //в методе проверяем первое число на римскую цифру и считаем
                    return result;
                } else {
                    if (!ara1.equals("-1")) {   //и если первое число это арабская цифра от 1 до 10
                        //    if (!ara2.equals("-1")) { // и если второе число это арабская цифра от 1 до 10
                        String result = logicArabCalc(input);
                        return result;
                        //        }
                    }
                    //         else {                        System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");}
                }
            }
            else {
                return "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) через пробел";  }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
        }

        return "throws Exception //т.к. используются одновременно разные системы счисления";
    }






    static String calcUlator(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
        }
        return Integer.toString(result);
    }


    static String isRoman (String row){
        switch (row) {
            case ("I"),("II"),("III"),("IV"),("V"),("VI"),("VII"),("VIII"),("IX"),("X"):
                return row;
            default:
                return "-1";
        }
    }
    static String isArab(String row) {
        switch (row) {
            case("1"),("2"),("3"),("4"),("5"),("6"),("7"),("8"),("9"),("10"):
                return row;
            default:
                return "-1"; //если это не арабское число в диапазоне 1-10
        }
    }
    static int rimskieChislaPerevod(String input) {
        switch (input) {
            case ("I"):
                return 1;
            case ("II"):
                return 2;
            case ("III"):
                return 3;
            case ("IV"):
                return 4;
            case ("V"):
                return 5;
            case ("VI"):
                return 6;
            case ("VII"):
                return 7;
            case ("VIII"):
                return 8;
            case ("IX"):
                return 9;
            case ("X"):
                return 10;
            default:
                return -1;
        }
    }
    static String rimskieChislaResult(String input) {
        int i = Integer.parseInt(input);
        switch (i) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 11:
                return "XI";
            case 12:
                return "XII";
            case 13:
                return "XIII";
            case 14:
                return "XIV";
            case 15:
                return "XV";
            case 16:
                return "XVI";
            case 17:
                return "XVII";
            case 18:
                return "XVIII";
            case 19:
                return "XIX";
            case 20:
                return "XX";
            case 21:
                return "XXI";
            case 22:
                return "XXII";
            case 23:
                return "XXIII";
            case 24:
                return "XXIV";
            case 25:
                return "XXV";
            case 26:
                return "XXVI";
            case 27:
                return "XXVII";
            case 28:
                return "XXVIII";
            case 29:
                return "XXIX";
            case 30:
                return "XXX";
            case 31:
                return "XXXI";
            case 32:
                return "XXXII";
            case 33:
                return "XXXIII";
            case 34:
                return "XXXIV";
            case 35:
                return "XXXV";
            case 36:
                return "XXXVI";
            case 37:
                return "XXXVII";
            case 38:
                return "XXXVIII";
            case 39:
                return "XXXIX";
            case 40:
                return "XL";
            case 41:
                return "XLI";
            case 42:
                return "XLII";
            case 43:
                return "XLIII";
            case 44:
                return "XLIV";
            case 45:
                return "XLV";
            case 46:
                return "XLVI";
            case 47:
                return "XLVII";
            case 48:
                return "XLVIII";
            case 49:
                return "XLIX";
            case 50:
                return "L";
            case 51:
                return "LI";
            case 52:
                return "LII";
            case 53:
                return "LIII";
            case 54:
                return "LIV";
            case 55:
                return "LV";
            case 56:
                return "LVI";
            case 57:
                return "LVII";
            case 58:
                return "LVIII";
            case 59:
                return "LIX";
            case 60:
                return "LX";
            case 61:
                return "LXI";
            case 62:
                return "LXII";
            case 63:
                return "LXIII";
            case 64:
                return "LXIV";
            case 65:
                return "LXV";
            case 66:
                return "LXVI";
            case 67:
                return "LXVII";
            case 68:
                return "LXVIII";
            case 69:
                return "LXIX";
            case 70:
                return "LXX";
            case 71:
                return "LXXI";
            case 72:
                return "LXXII";
            case 73:
                return "LXXIII";
            case 74:
                return "LXXIV";
            case 75:
                return "LXXV";
            case 76:
                return "LXXVI";
            case 77:
                return "LXXVII";
            case 78:
                return "LXXVIII";
            case 79:
                return "LXXIX";
            case 80:
                return "LXXX";
            case 81:
                return "LXXXI";
            case 82:
                return "LXXXII";
            case 83:
                return "LXXXIII";
            case 84:
                return "LXXXIV";
            case 85:
                return "LXXXV";
            case 86:
                return "LXXXVI";
            case 87:
                return "LXXXVII";
            case 88:
                return "LXXXVIII";
            case 89:
                return "LXXXIX";
            case 90:
                return "XC";
            case 91:
                return "XCI";
            case 92:
                return "XCII";
            case 93:
                return "XCIII";
            case 94:
                return "XCIV";
            case 95:
                return "XCV";
            case 96:
                return "XCVI";
            case 97:
                return "XCVII";
            case 98:
                return "XCVIII";
            case 99:
                return "XCIX";
            case 100:
                return "C";
            default:
                return "throws Exception //т.к. в римской системе нет отрицательных чисел";
        }
    }
    static String logicRimCalc(String input){
        String[] razdelenie = input.split(" ");
        if (!razdelenie[1].equals("+")&& !razdelenie[1].equals("-") && !razdelenie[1].equals("*") && !razdelenie[1].equals("/")) {
            return "Ошибка! неверный оператор!";} else {
            String one = razdelenie[0];
            String two = razdelenie[2];
            String operator = razdelenie[1];

            int one1 = rimskieChislaPerevod(one);
            int two2 = rimskieChislaPerevod(two);
            if (one1 == -1){ return "throws Exception //т.к. используются одновременно разные системы счисления";} else {
                String result = calcUlator(one1, two2, operator);
                return rimskieChislaResult(result);
            }
            //Считаем и возвращаем результат
        }
    }
    static String logicArabCalc(String input){

        String[] razdelenie = input.split(" ");

        String one = razdelenie[0];
        String two = razdelenie[2];
        String operator = razdelenie[1];
        if (!razdelenie[1].equals("+")&& !razdelenie[1].equals("-") && !razdelenie[1].equals("*") && !razdelenie[1].equals("/")) {
            return "Ошибка! неверный оператор!";} else {

            int one1 = Integer.parseInt(one);
            int two2 = Integer.parseInt(two);
            return calcUlator(one1, two2, operator);
        }
    }

}











// Character.isDigit(char ch) — Проверяет, является ли символ цифрой.
// Character.isLetter(char ch) — Проверяет, является ли символ буквой.


// или использовать indexOf() ссылка https://vertex-academy.com/tutorials/ru/indexof-java/

//С помощью Integer.parseInt() строковые представления чисел преобразуются в целые.



