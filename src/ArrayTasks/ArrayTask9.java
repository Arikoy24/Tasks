package ArrayTasks;

//Переворот массива (реверс).
//Реализуйте алгоритм, который изменяет порядок элементов массива на обратный (то есть делает реверс массива).

import java.util.Arrays;

public class ArrayTask9 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] reverseArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            reverseArr[arr.length - 1 - i] = arr[i];


        }

        System.out.println("Reversed array is: " + Arrays.toString(reverseArr));
    }
    }
