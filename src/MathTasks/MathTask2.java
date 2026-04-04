package MathTasks;

//2. Площа прямокутника:
//Напишіть програму, яка приймає довжину та ширину прямокутника і обчислює його площу (ширина * довжина).

import java.util.Scanner;

public class MathTask2 {

    static class Rectangle{
        int width;
        int height;

        Rectangle(int w, int height) {
            this.width = w;
            this.height = height;
        }

            int getWidth() {
                return width;
            }

            int getHeight(){
                return height;
            }
    }


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int w = input.nextInt();
        System.out.print("Enter height: ");
        int h = input.nextInt();
        Rectangle rect = new Rectangle(w, h);

        int square = rect.width * rect.height;
        System.out.println(square);

    }
}
