package IfElseTasks;

//Четное или нечетное число
//Задание: Создайте программу, которая определяет, является ли число чётным или нечётным.
//Подсказка: Проверьте, делится ли число на 2 без остатка (например, с помощью оператора %).

public class IfElseTask2 {
    public static void main(String[] args){

        int number = 5;

        if(number % 2 == 0){
            System.out.println("Number " + number + " is even ");
        }

        else{
            System.out.println("Number " + number + " is odd ");
        }
    }
    }

