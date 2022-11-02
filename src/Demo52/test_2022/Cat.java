package Demo52.test_2022;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;




    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public int compareTo(Cat o) {
        return o.getAge()-this.getAge();  //½µÐò
    }
}
