package Demo70;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    ObjectOutputStream 序列化
    ObjectOutputStream: 对象的序列化流
    作用：把Java对象转换为字节序列。
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setName("吴亦凡");
        person.setAge(110);
        //创一个ObjectOutputStream对象，构造方法传入OutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object0ut.txt"));
        //使用OutputStream.writeObject（），把对象写入到文件中
        objectOutputStream.writeObject(person);
        //资源释放
        objectOutputStream.close();
    }
}
