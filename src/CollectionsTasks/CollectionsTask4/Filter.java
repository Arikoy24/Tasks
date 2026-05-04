package CollectionsTasks.CollectionsTask4;

import java.util.ArrayList;
import java.util.Comparator;

public class Filter {

    public static ArrayList<Worker> filter(ArrayList<Worker> list, int sortAge) {

        ArrayList<Worker> sortedList = new ArrayList<>();

        if(sortAge < 18 || sortAge > 100) {
            System.out.println("Invalid input. Please try again.");
            return new  ArrayList<>();
        }

         list.sort(Comparator.comparing(Worker::getAge));


        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);

            if(w.getAge() >= sortAge) {
            sortedList.add(w);
            }
        }
        return sortedList;
    }
}

