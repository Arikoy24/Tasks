package IfElseTasks;

//Максимальное из трёх чисел
//Задание: Напишите программу, которая принимает на вход три числа и выводит наибольшее из них.
//Подсказка: Используйте вложенные операторы if-else для последовательного сравнения чисел.

import java.util.Scanner;

public class IfElseTask4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int n1 = sc.nextInt();
        System.out.println("Please enter the third number: ");
        int n2 = sc.nextInt();


        int max = n;

        if (n1 > max){
            max = n1;
        }
        if (n2 > max){
            max = n2;
        }
              System.out.println("The maximum number is " + max);




//        if(n1 >= n && n1 >= n2){
//            System.out.println("The max number is: " + n1);
//        }
//            else if(n >= n2 && n >= n1){
//                System.out.println("The max number is: " + n);
//            }
//            else{
//                System.out.println("The max number is: " + n2);
//            }
        }

    }

