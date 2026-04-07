package MathTasks;

//7. Розрахунок швидкості:
//Напишіть програму, яка зчитує відстань (у кілометрах) та час (у годинах) і обчислює швидкість (км/год).

import java.util.Scanner;

public class MathTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the distance: ");
        double distance = scanner.nextDouble();

        System.out.println("Please enter the time: ");
        double time = scanner.nextDouble();

        if (time <= 0) {
            System.out.println("There isn't enough time.");
            return;
        }

        double speed = distance / time;

        if (speed > 250) {
            System.out.println("The speed is too high, you should choose another way of transporting.");
            return;

        }

        System.out.printf("The speed is: %.2f km/h.",speed);
}
}
