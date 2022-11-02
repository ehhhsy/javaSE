package Demo46;
/*
  包装类3
  基本类型与字符串之间的转换
  基本类型---》字符串
  1.基本数据类型的值+“ ”最简单的方法（工作中常用 ）【重点】！！！
  2.包装类的静态方法【了解就行】
  static String toString(int i) 返回一个表示指定整数的 String 对象
  3.使用String类中的静态方法  【了解就行】
  static String ValueOf（int i）返回int参数的字符串表达式

  字符串--》基本类型
  使用包装类的静态方法parseXX（“字符串”）
   Integer类：Static int parseInt(String s)
   Double类： Static double parseDdouble（String s）
   。。。
 */
public class Demo03 {
    public static void main(String[] args) {
//        基本类型---》字符串
        String s1=100+" ";//1.基本数据类型的值+“ ”最简单的方法（工作中常用）
        System.out.println(s1+200);//100 200   【重点】

//        2.包装类的静态方法
//        static String toString(int i) 返回一个表示指定整数的 String 对象
        String s2=Integer.toString(100);
        System.out.println(s2+200);//100200


        String s3 = String.valueOf(100);
        System.out.println(s3+"200");//100200

//        ===========================================================================
        System.out.println("=======================================");
//        字符串--》基本类型
        int i1 = Integer.parseInt("450");
        System.out.println(i1+100);  //550

        double v = Double.parseDouble("20.3");
//        double v = Double.parseDouble("a");//错误，内容必须是基本数据类型
        System.out.println(v+30);

    }
}
