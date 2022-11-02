package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Collection
public class test7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"HH","HH","TT");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList,1,2,3,5,6,72,2,3,53,1);
        System.out.println("sort-end");
        System.out.println(integerArrayList);
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);
        Collections.sort(integerArrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(integerArrayList);
    }
}
