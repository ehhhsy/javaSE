package Demo50;

import java.util.*;

public class test_2022 {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.push(111);
        linkedList.push(222);
        linkedList.push(333);
        System.out.println(linkedList.getFirst());  //333
        System.out.println(linkedList.getLast());  //111

        Integer remove1 = linkedList.removeFirst();
        Integer remove2 = linkedList.removeLast();
        System.out.println("the remove1 is "+remove1);  //333
        System.out.println("the remove2 is "+remove2); //111
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty()); //false
    }
}
