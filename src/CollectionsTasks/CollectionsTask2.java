package CollectionsTasks;

//Удаление дубликатов из списка:
//Дана коллекция ArrayList с повторяющимися элементами. Напишите программу, которая удаляет все
//дубликаты из списка, сохраняя порядок элементов, и выводит обновленный список.

import java.util.*;

public class CollectionsTask2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6));

        list.add(10);
        list.add(20);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

//        List<Integer> result = new ArrayList<>();
//
//        for (Integer num : list) {
//            if (!result.contains(num)) {
//                result.add(num);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> list2 = new ArrayList<>(set);

        System.out.println(list2);


    }
}
