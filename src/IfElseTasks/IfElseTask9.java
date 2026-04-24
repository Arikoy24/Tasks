package IfElseTasks;

//День недели
//Задание: Напишите программу, которая принимает на вход число (от 1 до 7) и выводит соответствующий день недели (например, 1 — понедельник, 2 — вторник и т.д.).
//Подсказка: Используйте конструкцию if-elif-else или switch-case (если язык программирования поддерживает) для сопоставления числа с днем недели.

import java.util.Scanner;

public class IfElseTask9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number 1-7: ");
        int day = 0;

        //here I use try for practice

        try{
            day = input.nextInt();
        } catch (Exception e){
            System.out.println("Invalid input");
            return;
        }

        switch (day){
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday! Weekend is here!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday! Time to have a good rest for the upcoming week!");
                break;
            default:
                System.out.println("The number is wrong =(");
        }


    }
}
