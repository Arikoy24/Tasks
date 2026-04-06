package IfElseTasks;

//Проверка права на голосование
//Задание: Напишите программу, которая определяет, имеет ли человек право голосовать, исходя из его возраста.
//Подсказка: Обычно минимальный возраст для голосования составляет 18 лет (вы можете задать иное значение по необходимости).

import java.util.Scanner;

public class IfElseTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();


        if (age < 0){
            System.out.println("Please input a correct age.");
        }
        else if (age >= 18) {
            System.out.println("Please choose the candidates you would like to vote for.");
        }
        else if (age < 18){
                System.out.println("Unfortunately you don't have a right to vote yet.");
        }


    }
}
