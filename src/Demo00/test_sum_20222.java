package Demo00;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test_sum_20222 {
    public static void main(String[] args) throws ParseException {
        HashSet<Dog> hashSet = new HashSet<>();
        LinkedHashSet<Dog> linkedHashSet = new LinkedHashSet<>();

        Collections.addAll(hashSet,new Dog("С��",30),new Dog("С��",23),new Dog("���",1));
        System.out.println(hashSet);
        Collections.addAll(linkedHashSet,new Dog("С��",30),new Dog("С��",23),new Dog("���",1));

    }
}
