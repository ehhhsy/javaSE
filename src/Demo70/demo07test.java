package Demo70;

import java.io.*;
import java.util.ArrayList;

//test1：序列化集合
public class demo07test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person_1 = new Person("吴亦凡", 30);
        Person person_2 = new Person("李易峰", 50);
        Person person_3 = new Person("王力宏", 40);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(person_1);
        arrayList.add(person_2);
        arrayList.add(person_3);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("list.txt"));
        objectOutputStream.writeObject(arrayList);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("list.txt"));
        Object o = objectInputStream.readObject();
        ArrayList<Person> list = (ArrayList) o;
        for (Person person : list) {
            System.out.println(person);
        }
        objectOutputStream.close();
        objectInputStream.close();

    }
}
