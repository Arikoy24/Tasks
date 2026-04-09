package StringTasks;

//2. Сума чисел у рядку
//Завдання: Метод повинен знайти всі числа у рядку та повернути їхню суму.
//
//int sumNumbers(String input);
//Приклад:
//
//sumNumbers("abc12de3f100") → 115

public class StringTask2 {

    public static void main(String[] args) {
        String input = "abc12de3f100";
        int result = sumNumbers(input);
        System.out.println(result);

    }

    public static int sumNumbers(String input) {

        char[] arr = input.toCharArray();

        int sum = 0;
        int current = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
               current = (10 * current) + (arr[i] - '0');
            }

            else{
                sum += current;
                current = 0;
            }
        }

        sum += current;

        return sum;
    }
}