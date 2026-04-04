package MathTasks;

//4. Середнє арифметичне:
//Напишіть програму, яка приймає три числа і обчислює їхнє середнє арифметичне.

import java.util.Scanner;

public class MathTask4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = input.nextInt();
        System.out.println("Please enter the second number");
        int b = input.nextInt();
        System.out.println("Please enter the third number");
        int c = input.nextInt();
        float average = (a + b + c) / 3.0f;
        System.out.printf("The average number is %.2f", average);
    }
}
