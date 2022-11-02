package Demo63.test2022;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        Person [] arr={new Person("Ð¡°×",20),new Person("Ð¡ºÚ",5),new Person("»ÒÌ«ÀÇ",30)};
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Arrays.sort(arr,((Person o1, Person o2) -> {
            return o2.getAge()-o1.getAge();
        }));
        for (Person person : arr) {
            System.out.println(person.getName()+"--"+person.getAge());
        }

    }
}
