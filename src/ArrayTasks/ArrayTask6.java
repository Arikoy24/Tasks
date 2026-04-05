package ArrayTasks;

//Поиск индекса заданного элемента.
//Реализуйте программу, которая принимает число и выводит индекс его первого вхождения в массив. Если число не найдено, выведите соответствующее сообщение.

import java.util.Scanner;

public class ArrayTask6 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the preferred number: ");
        int number = scanner.nextInt();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                found = true;
                System.out.println("The number is under the index: " + i);
                break;
            }
            }
        if(!found){

            System.out.println("The number " + number + " is not found in the array.");
    }
    }
}


