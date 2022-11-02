package Demo47;

import java.util.ArrayList;
import java.util.Iterator;

public class test {

    public static void main(String[] args) {
        tree<Integer> integertree = new tree<>();
        integertree.setName(11);
        System.out.println(integertree.getName());
        getSum(1);
        getSum("dadaw");
    }


    public static <E> void getSum(E e){
        System.out.println(e);
    }
}
