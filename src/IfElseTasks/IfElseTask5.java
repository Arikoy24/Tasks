package IfElseTasks;

//Гласная или согласная буква
//Задание: Напишите программу, которая определяет, является ли введённый символ гласной или согласной буквой.
//Подсказка: Проверьте, входит ли символ в набор гласных (например, 'а', 'е', 'и', 'о', 'у'), учитывая как прописные, так и строчные буквы.

import java.util.Scanner;

public class IfElseTask5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter preferred letter");

        char letter = Character.toLowerCase(scanner.nextLine().charAt(0));

        if(letter == 'a' || letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o' || letter == 'y'){
            System.out.printf("Letter %c is vowel", letter);
        }

        else if(Character.isLetter(letter)){
            System.out.printf("Letter %c is consonant", letter);

//        else if(letter == 'q' || letter == 'w' || letter == 'r' || letter == 't' || letter == 'p' || letter == 's' ||
//        letter == 'd' || letter == 'f' || letter == 'g' || letter == 'h' || letter == 'j' || letter == 'k' ||
//        letter == 'l' || letter == 'z' || letter == 'x' || letter == 'c' || letter == 'v' || letter == 'b' ||
//        letter == 'n' || letter == 'm'){
//            System.out.printf("Letter %c is consonant", letter);
        }

        else{
            System.out.println("This is not a letter");
    }
}
}
