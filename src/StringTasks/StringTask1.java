package StringTasks;


//1. Сжатий рядок (Compression)
//Завдання: Реалізуй метод:
//
//String compress(String input);
//Приклад:
//
//compress("aaabccdddda") → "a3bc2d4a"
//Якщо символ зустрічається один раз — не додавати цифру.


public class StringTask1 {
    public static void main(String[] args) {


        String compress = "aaabccdddda";
        StringBuilder sb = new StringBuilder();
        char current;
        char next;
        int count = 1;


        for (int i = 0; i < compress.length() - 1; i++) {
            current = compress.charAt(i);
            next = compress.charAt(i + 1);

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

        sb.append(compress.charAt(compress.length() - 1));

        if (count >1){
            sb.append(count);
        }

        System.out.println(sb.toString());

    }
}
