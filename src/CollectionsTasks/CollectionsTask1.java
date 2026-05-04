package CollectionsTasks;

//Поиск пересечения двух массивов:
//Напишите программу, которая находит пересечение двух массивов целых чисел, используя HashSet. Ваша
//программа должна вернуть новый массив с элементами, которые присутствуют в обоих массивах.

import java.util.Arrays;
import java.util.HashSet;

        public class CollectionsTask1 {

            public static void main(String[] args) {

                int[] arr = {1,2,3,4,5,6,7,8,9,10};
                int[] arr1 = {1,20,30,4,5,67,79,82,9,10,11};

                HashSet<Integer> set = new HashSet<Integer>();
                HashSet<Integer> set1 = new HashSet<Integer>();

//                for(int i=0;i<arr.length;i++){
//                    for(int j=0;j<arr1.length;j++){
//                        if(arr[i] == arr1[j]){
//                            set.add(arr[i]);
//                        }
//                    }
//                }

                for(int num : arr){
                    set.add(num);
                }
                for(int num : arr1) {
                    set1.add(num);
                }

                set.retainAll(set1);

                int[] newArr = new int[set.size()];
                int i = 0;

                for(int num : set){
                    newArr[i++] = num;
                }
                Arrays.sort(newArr);
                System.out.println(Arrays.toString(newArr));
    }
}
