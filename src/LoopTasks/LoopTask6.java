package LoopTasks;

//Вывод элементов массива с помощью for-each.
//Создайте массив чисел и выведите все его элементы, используя цикл for-each.


public class LoopTask6 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        for (int i : arr){
            System.out.println(i);
        }
    }
}
