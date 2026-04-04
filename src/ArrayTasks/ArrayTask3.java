package ArrayTasks;

//Среднее значение элементов массива.
//Напишите программу, которая находит среднее арифметическое значений элементов массива.



public class ArrayTask3 {

    public static void main(String[] args){

        int sum = 0;

        int[] arr = {1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int num : arr){
        sum += num;
        }

        double average = (double) sum / arr.length;
        System.out.println(average);

    }
}
