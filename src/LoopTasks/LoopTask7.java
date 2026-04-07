package LoopTasks;

//Вычисление факториала числа.
//Напишите программу, которая вычисляет факториал заданного числа с использованием цикла for.

import java.util.Scanner;

public class LoopTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        if (num < 0){
            System.out.println("Unfortunately, factorial cannot be negative.");
            return;
        }

        int factorial = 1;

        for (int i = num; i >= 1; i--){
            factorial *= i;
        }

        System.out.println(factorial);


    }
}
