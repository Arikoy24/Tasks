package StringTasks.StringTask4;

//4. Валідація email-адреси
//Завдання: Реалізуй метод:
//
//boolean isValidEmail(String email);
//Перевірка має відбуватись за допомогою регулярного виразу.

import static StringTasks.StringTask4.IsValidEmail.isValidEmail;

public class Main {

    public static void main(String[] args) {


        System.out.println("abcd@gmail.com -> " + isValidEmail("abcd@gmail.com"));
        System.out.println("@gmail.com -> " + isValidEmail("@gmail.com"));
        System.out.println("abcd@@gmail.com -> " + isValidEmail("abcd@@gmail.com"));
        System.out.println("abcd@.com -> " + isValidEmail("abcd@.com"));
        System.out.println("abcd@gmail.com. -> " + isValidEmail("abcd@gmail.com."));

    }
}
