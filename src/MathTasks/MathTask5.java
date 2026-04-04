package MathTasks;

//Площа і периметр кола:
//Напишіть програму, яка, знаючи радіус кола, обчислює його площу (π·r²) та периметр (2·π·r).

public class MathTask5 {
    public static void main(String[] args) {

        double r = 5;

        double perimeter = (2 * Math.PI) * r;
        double area = Math.PI * r * r;

        System.out.printf("The perimeter is %.2f\n", perimeter);
        System.out.printf("The area is %.2f", area);

    }
}
