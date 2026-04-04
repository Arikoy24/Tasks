package ArrayTasks;

//Сумма элементов массива.
//Реализуйте программу, которая вычисляет сумму всех элементов массива и выводит результат.

public class ArrayTask2 {

    public static void main(String[] args) {

        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
        }

        System.out.println(sum);
    }
}
