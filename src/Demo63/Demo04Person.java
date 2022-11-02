package Demo63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Demo04Person {
    public static void main(String[] args) {

        Person[] arr= {
                new Person("小王", 11),
        new Person("函数", 13),
        new Person("惠普", 1),

};
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序（前面-后面）
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()- o2.getAge();
//            }
//        });

        //使用lambda表达式，简化
        Arrays.sort(arr,(o1,o2)->{
            return o1.getAge()- o2.getAge();
        });

        for (Person p:arr
             ) {
            System.out.println(p);
        }
    }
}
