package CollectionsTasks.CollectionsTask4;

//Фильтрация сотрудников по возрасту:
//У вас есть список сотрудников, каждый из которых имеет имя и возраст. Напишите программу, которая
//использует ArrayList для хранения сотрудников и фильтрует их по возрасту
//(например, только старше 30 лет). Выведите отфильтрованный список.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number. The workers will be sorted from this age.");
        int sortAge =  input.nextInt();

        ArrayList<Worker> list = new ArrayList();

        Worker alex = new Worker("Alex", 18);
        Worker ben = new Worker("Ben", 19);
        Worker brian = new Worker("Brian", 35);
        Worker david = new Worker("David", 41);

        list.add(alex);
        list.add(ben);
        list.add(brian);
        list.add(david);

        System.out.println(Filter.filter(list, sortAge));
    }
}
