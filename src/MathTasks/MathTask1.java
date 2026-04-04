package MathTasks;//1. Обчислення базових операцій:
//Напишіть програму, яка зчитує два цілі числа з консолі та виводить їхню суму, різницю, добуток і частку.

import java.util.Scanner;


public class MathTask1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int x = scanner.nextInt();
        System.out.println("Please enter the second number");
        int y = scanner.nextInt();

        int a = x+y;
        int b = x-y;
        int c = x*y;
        int d = x/y;

        System.out.println("x + y = " + a);
        System.out.println("x - y = " + b);
        System.out.println("x * y = " + c);
        System.out.println("x / y = " + d);


}
}
