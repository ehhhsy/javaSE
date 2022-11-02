package Demo52.test_2022;

import java.util.ArrayList;
import java.util.Collections;

public class test_2022 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("»¨¾í", 10);
        Cat cat2 = new Cat("ÌÀÔ²", 11);
        Cat cat3 = new Cat("ÎÚÁú", 12);

        ArrayList<Cat> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,cat1,cat2,cat3);
        Collections.sort(arrayList);
        System.out.println(arrayList);      //[Cat{name='ÎÚÁú', age=12}, Cat{name='ÌÀÔ²', age=11}, Cat{name='»¨¾í', age=10}]
    }
}
