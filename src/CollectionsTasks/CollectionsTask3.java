package CollectionsTasks;

//Ротация списка:
//Напишите программу, которая принимает LinkedList и поворачивает его на заданное количество позиций
//вправо. Например, для списка [1, 2, 3, 4, 5] и сдвига на 2 позиции результатом будет [4, 5, 1, 2, 3].

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsTask3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(10,20,30,40,50,60,70,80,90,100));

//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);

        if(list.isEmpty()){
            System.out.println("List is empty");
        }

        int shift = 2;
        shift %= list.size();


        for(int i = 0; i < shift; i++) {
            list.add(0, list.getLast());
            list.removeLast();
//            list.addFirst(list.removeLast());
        }

//        Queue<Integer> queue = list;
//        for(int i = 0; i <= 2; i++){
//            queue.remove(list.);
//            queue.add(i);
//        }

        System.out.println(list);

    }
}

