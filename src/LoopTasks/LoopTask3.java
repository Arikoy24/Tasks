package LoopTasks;
import java.util.Scanner;

//Вычисление суммы чисел от 1 до N.
//Напишите программу, которая находит сумму чисел от 1 до заданного N.


public class LoopTask3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the preferred number: ");
        int N = input.nextInt();
        int sum = 0;

        for(int i = 0; i <= N; i++){
            sum += i;
        }
        System.out.println("The sum of all the numbers between 1 and " + N + " is: " + sum);
    }
}
