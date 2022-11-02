package test;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList test
public class test2 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('b');
        list.add('c');
        System.out.println(        list.contains('C'));
        System.out.println(        list.contains('c'));
        System.out.println(list.size());
        System.out.println("--------------------");
        for (Character character : list) {
            System.out.println(character);
        }
        System.out.println("--------------------");

        Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
