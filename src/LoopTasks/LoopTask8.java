package LoopTasks;

//Сумма элементов массива.
//Найдите сумму всех элементов целочисленного массива, используя цикл for-each.

public class LoopTask8 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int num : arr){
            sum += num;

        }
        System.out.println("The sum of all the numbers in the array is:" + sum);
    }
}
