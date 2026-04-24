package LoopTasks;

//Поиск максимального элемента в массиве.
//Напишите программу для нахождения максимального значения в массиве чисел.


import java.util.Scanner;

public class LoopTask9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,100,200,300,400,500,600,709,210,305};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The max number is: " + max);

    }

}
