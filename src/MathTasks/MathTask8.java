package MathTasks;

//8. Конвертація кілометрів у милі:
//Напишіть програму, яка приймає відстань у кілометрах та конвертує її у милі, використовуючи відповідний коефіцієнт перетворення.

import java.util.Scanner;

public class MathTask8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the kilometers to convert into miles: ");
        double km = input.nextDouble();
        double miles = kmToMiles(km);
        System.out.println("The amount of miles is: " + miles);

    }


//    public class Converter {
//
//        public static double kmToMiles(double km) {
//            return km * 0.621371;
//        }
//
//        public static double milesToKm(double miles) {
//            return miles * 1.60934;
//        }
//    }


    public static double kmToMiles(double km) {

        double miles = km * 0.621371192;
        return miles;
    }
}

