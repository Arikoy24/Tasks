package IfElseTasks;

//Положительное, отрицательное или ноль
//Задание: Напишите программу, которая считывает целое число и выводит, является ли число положительным, отрицательным или нулём.
//Подсказка: Используйте операторы if, elif/else для сравнения числа с 0.


public class IfElseTask1 {
    public static void main(String[] args){

        int num = 0;

        if(num > 0)
            System.out.println(num + " is positive");
        else if(num < 0)
            System.out.println(num + " is negative");
        else
            System.out.println("Number is zero");

//        String number = (num >= 0) ? "Number is positive" : "Number is negative";
//        System.out.println(number);
    }
}
