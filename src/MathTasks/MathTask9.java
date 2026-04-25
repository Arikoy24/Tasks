package MathTasks;

//9. Розрахунок загальної вартості покупки:
//Напишіть програму, яка приймає ціну за одиницю та кількість одиниць товару, а потім обчислює загальну суму покупки.

import java.util.Scanner;

public class MathTask9 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the name of the article: ");
     String product = input.nextLine();

     if(product.trim().isEmpty()){
      System.out.println("The name cannot be empty");
      return;
     }

     System.out.println("Please enter the price of the product");
     if (!input.hasNextDouble()){
      System.out.println("Invalid price input.");
      return;
     }
     double price = input.nextDouble();
     if (price < 0){
      System.out.println("The price cannot be negative");
      return;
     }

     System.out.println("Please enter the quantity of the product");
     if (!input.hasNextInt()){
      System.out.println("Invalid quantity input.");
      return;
     }

     int quantity = input.nextInt();

     if (quantity < 0){
      System.out.println("The quantity cannot be negative.");
      return;
     }

     double totalPrice = (price * quantity);
     System.out.printf("The total price is: %.2f%n", totalPrice);
     System.out.println("Thank you for your purchase!");

    }
}
