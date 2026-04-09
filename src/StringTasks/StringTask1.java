package StringTasks;


//1. Сжатий рядок (Compression)
//Завдання: Реалізуй метод:
//
//String compress(String input);
//Приклад:
//
//compress("aaabccdddda") → "a3bc2d4a"
//Якщо символ зустрічається один раз — не додавати цифру.

import java.util.Scanner;


public class StringTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a line you would like to compress: ");

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char current;
        char next;
        int count = 1;


        for (int i = 0; i < input.length() - 1; i++) {
            current = input.charAt(i);
            next = input.charAt(i + 1);

            if (current == next) {
                count++;
            } else {
                sb.append(current);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        sb.append(input.charAt(input.length() - 1));

        if (count >1){
            sb.append(count);
        }

        System.out.println(sb.toString());

    }
}
