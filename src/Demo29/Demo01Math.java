package Demo29;
  /*
    java.util.Math类是数学相关的工具类，里面提供大量的静态方法，完成与数学运算相关的操作
     hsy:向上取整,向下取整,四舍五入 都是关于小数的，

    public static double abs(double num):  获取绝对值
    public static double ceil(double num): 向上取整
    public static double floor(double num） 向下取整
    public static long round (double num)   四舍五入

    Math.PI代表近似圆周率常量（double）  System.out.println(Math.PI);
   */
public class Demo01Math {
      public static void main(String[] args) {
         double a =-2322.21;
         double abs =Math.abs(a);
          System.out.println(abs);  //  获取绝对值  2322.21   都是关于小数的，

          System.out.println("==========");

          double b=53.2;
          double ceil=Math.ceil(b);
          System.out.println(ceil);    //向上取整   54.0   都是关于小数的，


          System.out.println("==========");

         double c=69.1;
         double flooar =Math.floor(c);
          System.out.println(flooar);  // 向下取整  69.0   都是关于小数的，
          System.out.println(Math.floor(30.1));
          System.out.println(Math.floor(30.9));
          System.out.println(Math.floor(30.0));


          System.out.println("==========");
          double d =54.2;
          double e=42.9;
          double d1=Math.round(d);
          double e1=Math.round(e);
          System.out.println(d1);    //54.0   //四舍五入   都是关于小数的，
          System.out.println(e1);    //43.0
          System.out.println(Math.round(38));  //38 四舍五入还是38

          System.out.println(Math.PI);

          System.out.println("================2020.11.11");
          double shy=-113.231;
          System.out.println(Math.abs(shy));  //113.231
          System.out.println(Math.ceil(shy)); //-113.0
          System.out.println(Math.floor(shy)); //-114.0
          System.out.println(Math.round(shy)); //-113
      }
}
