package ArrayTasks;

//Нахождение минимального элемента.
//Создайте программу для поиска минимального значения в заданном массиве чисел.

import java.util.Random;

public class ArrayTask4 {

    public static void main(String[] args) {

        int[] arr = new int[]{765, 310, 578, 1945, 345, 10895, 112, 156, 210, 100};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
//            String check = (min < arr[i]) ? "YES" : "NO";
//            return;
//        }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Number " + min + " is minimum");
    }
}

