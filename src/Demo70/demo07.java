package Demo70;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    PrintStream
 */
public class demo07 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("printlnStreamTest.txt");
        printStream.write(97);      //a
        printStream.write(98);      //b
        printStream.write(99);      //c
        printStream.println("哈哈");
        printStream.print("埃杜阿多");
        printStream.print('A');
        printStream.print(true);
        printStream.print(2.53);
        //释放资源
        printStream.close();


//        //创建PrintStream对象，构造方法绑定输出目的地
//        PrintStream printStream = new PrintStream("OutPrint.txt");
////        调用System.SetOut（），传递PrintStream
//        System.setOut(printStream);
//        //打印不会出现在控制台，而是在目标文件中
//        System.out.println("hello world");
//        System.out.println("哇大大我的卡我到家了哇");
    }
}
