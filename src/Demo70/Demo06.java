package Demo70;

import java.io.*;

/*
Person person = (Person) object;
 */
public class Demo06 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object0ut.txt"));
        //使用ObjectInputStream.readObject（），读取保存对象的文件
        Object object = objectInputStream.readObject();
        //释放资源
        objectInputStream.close();
        System.out.println(object); //Person{name='吴亦凡', age=110}
        Person person = (Person) object;
        System.out.println(person.getName());
    }
}
