package Demo48;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hallo");
        list1.add("h");
        list1.add("sy");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);

        print(list1);
        print(list2);
    }
    //通配符用法
    public  static<E> void print(ArrayList<E> list){
        for (E e:list
             ) {
            System.out.println(e);
        }
    }
}
