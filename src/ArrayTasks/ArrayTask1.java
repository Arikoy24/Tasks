package ArrayTasks;//Вывод элементов массива.
//Напишите программу, которая выводит все элементы заданного одномерного массива на экран.


public class ArrayTask1 {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }
    }
}
