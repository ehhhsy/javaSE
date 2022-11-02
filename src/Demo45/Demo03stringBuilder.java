package Demo45;
//stringbuilder的toString方法
/*
Stringbuilder和String可以互相转换
   Stringbuilder————》String     构造方法
   StringBuilder(String str)
          构造一个字符串生成器，并初始化为指定的字符串内容。
    String  ————》Stringbuilder
    public String toString（）;  成员方法
           将当前Stringbuilder变成字符串
 */
public class Demo03stringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("卢本伟");
        stringBuilder.append("abc").append(true).append(123);
        System.out.println(stringBuilder);
        System.out.println("============");
        String s = stringBuilder.toString();
        System.out.println(s);

    }
}
