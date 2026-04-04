package LoopTasks;

//Построчный вывод символов строки.
//Дана строка. Используя цикл for, выведите каждый её символ на новой строке.

public class LoopTask5 {

    public static void main(String[] args) {

        String str = "Hello World!";
        char[] letters = str.toCharArray();

//        for (int i = 0; i < letters.length; i++){
//            System.out.println(letters[i]);
//        }

        for(char letter : letters){
            System.out.println(letter);
        }

    }
}
