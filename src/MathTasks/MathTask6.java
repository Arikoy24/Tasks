package MathTasks;

//Розрахунок вартості зі знижкою:
//Напишіть програму, яка обчислює фінальну ціну товару за формулою:
//finalPrice = originalPrice – (originalPrice * discountPercentage / 100).

public class MathTask6 {

    public static void main(String[] args) {

        double originalPrice = 1999.99;
        double discountPercent = 20;
        double discount = originalPrice * discountPercent / 100;
        double finalPrice = originalPrice - discount;

        System.out.printf("Final Price: %.2f", finalPrice);

    }
}
