package LoopTasks;

//Таблица умножения от 1 до 10.
//С помощью вложенных циклов for выведите таблицу умножения для чисел от 1 до 10.

public class LoopTask4 {

    public static void main(String[] args) {

        for(int a = 1; a <= 10; a++){
            for(int j = 1; j <= 10; j++){
                System.out.printf("%2d * %d = %3d   ", a, j, a*j);
        }
            System.out.println();

    }
}
}