package ArrayTasks;

//Нахождение максимального элемента.
//Напишите программу, которая находит максимальное значение в массиве.


public class ArrayTask5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];

            }
            }
        System.out.println("The max number is: " + max);
    }
}
