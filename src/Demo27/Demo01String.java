package Demo27;
///*
// * java.lang.String类代表字符串。
// * API文档中说：Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
// *  就是说：程序当中所有的双引号字符串，都是String类的对象，就算没有new，有照样是
//
// 字符串的特点：
// 1.字符串的内容永不可变。  【重点】
// 2.真是因为字符串不可改变，所以字符串是可以共享使用。 （前提是字符串的内容永不可变）
// 3.字符串效果==char[]字符数组，但是底层原理是byte[]字节数组
//
//  创建字符串的常见3+1种方式 （4种）
//  三种构造方法：
//  public String();   创建一个空白字符串，不含有任何内容
//  public String(char [] array): 根据字符数组的内容，来创建对于的字符串
//  public String(byte [] array): 根据字节数组的内容，来创建对于的字符串
//  直接创建：
//  String one ="jdsz";
//
//  注意：直接写上双引号，就是字符串对象。
// */
public class Demo01String {
    public static void main(String[] args) {
//   //1.使用空参构造
//	String str1 =new String();
//	System.out.println("第一个字符串"+str1);
//
//	//2.根据字符数组创建字符串
//	char[] ar = {'德','邦','总','管'};
//	String str2 =new String( ar);  //参数里是char数组
//	System.out.println("第二字符串"+str2);  //
//
//	//3.根据字节数组创建字符串
//	byte [] by = {97,98,99};
//	String str3 =new String(by);  //参数里都是字节数组
//	System.out.println("第三字符串"+str3);  /* abc */
//
//	//4.直接创建
//	String a="hallo,python";
//	System.out.println(a);
//	System.out.println("=============");
//	//1.创建空参构造
//	String a1= new String();
//
//	//2.char数组作为参数
//	char [] char1= {'1','2','3'};
//     String a2= new String(char1);
//     System.out.println(a2);
//
//     //3.byte数组作为参数
//     byte [] a3 = {111,112,113};
//     System.out.println(new String(a3));


    char[] abc = {'z', 'j', 'l', 'h'};
    String aaa=new String(abc);
        System.out.println(aaa);
    }
}