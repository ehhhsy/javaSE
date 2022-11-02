package Demo49;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//2022 斗地主案例
public class test_doudizhu {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("?");
        list1.add("?");
        list1.add("?");
        list1.add("?");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");
        list2.add("9");
        list2.add("10");
        list2.add("J");
        list2.add("Q");
        list2.add("K");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("大王");
        list3.add("小王");
        for (int i = 0; i < list1.size(); i++) {
            for (int l = 0; l < list2.size(); l++) {
                list3.add(list1.get(i)+list2.get(l));
            }
        }
        System.out.println(list3);

        Collections.shuffle(list3);

        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<String> list6 = new ArrayList<>();
        ArrayList<String> list7_three = new ArrayList<>();
        for (int i=0;i<list3.size();i++) {
            if (i>=51){
                list7_three.add(list3.get(i));
            }
            if (i%3==0){
                list4.add(list3.get(i));
            }else if(i%3==1){
                list5.add(list3.get(i));
            }else if(i%3==2){
                list6.add(list3.get(i));
            }
        }
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);
        System.out.println("底牌是"+list7_three);
    }
}
