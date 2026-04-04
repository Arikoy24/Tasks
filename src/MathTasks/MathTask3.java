package MathTasks;

//3. Конвертація температур:
//Напишіть програму для конвертації температури з градусів Цельсія у Фаренгейти за формулою:
//F = (9/5) * C + 32.

import java.util.Scanner;

public class MathTask3 {

    public static void main(String[] args) {

        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Please enter the outside temperature in degrees Celsius: ");
        float tempC = inputTemp.nextFloat();
//        float tempF = ((9f / 5) * tempC) + 32;
        float tempF = tempC * 9 / 5 + 32;
        System.out.println("The temperature in degrees Fahrenheit is: " + tempF);

    }
}
