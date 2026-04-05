package IfElseTasks;

//Оценка по баллам
//Задание: Создайте программу, которая присваивает буквенную оценку (например, A, B, C, D, F) на основе числового результата.
//Подсказка: Используйте последовательность операторов if-elif-else для проверки диапазонов (например, 90–100 для A, 80–89 для B и т.д.).


public class IfElseTask6 {
    public static void main(String[] args) {

        int grade = 150;
        char letter;

        if (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100.");
            return;
        }

        if (grade >= 90){
            letter = 'A';
        }
        else if (grade >= 80){
            letter = 'B';
        }
        else if (grade >= 70){
            letter = 'C';
        }
        else if (grade >= 60){
            letter = 'D';
        }
        else{
            letter = 'F';
        }

        System.out.printf("Your grade is %c. ", letter);

        if (letter == 'F'){
            System.out.println("This time unfortunately you failed. Try next time!");

        }
    }
}
