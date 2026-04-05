package ArrayTasks;

//Подсчёт количества вхождений элемента.
//Напишите программу, которая считает, сколько раз заданное число встречается в массиве.

import java.util.Scanner;

public class ArrayTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the preferred number: ");
        int number = scanner.nextInt();

        int count = 0;

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == number){
//                count++;
//            }
//        }

        for (int i : arr) {
            if (i == number) {
                count++;
            }
        }

            if (count == 0) {
                System.out.println("The number you entered is not in the array.");
            }
            else {
                System.out.printf("The number was found in the array %d times.", count);
            }


    }
}