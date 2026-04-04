package IfElseTasks;

//Проверка високосного года
//Задание: Напишите программу, которая проверяет, является ли заданный год високосным.
//Подсказка: Год считается високосным, если он делится на 4, но не делится на 100, за исключением случая, когда он делится на 400.

import java.util.Scanner;

public class IfElseTask3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year you'd like to check: ");
        int year = scanner.nextInt();

        if((year % 4 == 0  && year % 100 != 0) || year % 400 == 0){
            System.out.println("This is the leap year!");
        }
        else{
            System.out.println("This is not the leap year!");
        }
    }
}
