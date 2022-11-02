package Demo45;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        StringBuilder stringBuffer = new StringBuilder("hello world");
        stringBuffer.append("adadawda").append(231).append('A');
        System.out.println(stringBuffer);       //hello worldadadawda231A
        StringBuilder stringBuffer_reverse = stringBuffer.reverse();
        System.out.println(stringBuffer==stringBuffer_reverse);     //true 表示同一对象
        System.out.println(stringBuffer_reverse);       //A132adwadadadlrow olleh

        System.out.println(stringBuffer.toString());   //A132adwadadadlrow olleh
    }
}
