package IfElseTasks;

//Проверка пароля
//Задание: Создайте программу, которая проверяет, соответствует ли введённый пароль определённым критериям (например, минимум 8 символов, содержит как буквы, так и цифры и т.д.).
//Подсказка: Используйте операторы if-else для проверки каждого условия и выводите сообщение, если какой-либо из критериев не выполнен.

import java.util.Scanner;

public class IfElseTask8 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String password;

        char current;
        boolean isUpper = false;
        boolean isDigit = false;
        boolean isSymbol = false;

        do {
            System.out.println("Please enter your password: ");
            password = input.nextLine();
            if (password.isEmpty()) {
                System.out.println("Password cannot be empty");
            }
        }
        while (password.isEmpty());

        if (password.length() < 8) {
            System.out.println("The password should be minimum 8 symbols long");
            return;
        }


        for (int i = 0; i < password.length(); i++) {
            current = password.charAt(i);

            if (Character.isUpperCase(current)) {
                isUpper = true;
            }
            if (Character.isDigit(current)) {
                isDigit = true;
            }
            if (!Character.isLetterOrDigit(current)) {
                isSymbol = true;
            }
        }

        if (isUpper && isDigit && isSymbol) {
            System.out.println("Checking your password.");
        }
        if (!isUpper){ System.out.println("Capital letter is missting.");}
        if (!isDigit){ System.out.println("Digit is missing");}
        if (!isSymbol){ System.out.println("Special symbol is missing");}

    }
}