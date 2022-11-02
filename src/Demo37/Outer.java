package Demo37;
/*
内部类同名变量访问
 格式： 外部类名称.this.外部类成员变量名
  System.out.println(Outer.this.num);
 */

public class Outer {
  int num=10;  //外部类的成员变量


   public class Inner{
       int num=20;  //内部类的成员变量

       public  void methodInner(){
           int num=30;  //内部类方法的局部变量

           System.out.println(num); //局部变量30，就近原则
           System.out.println(this.num);//20
//         System.out.println(super.num); 错误，不是继承关系

           //正确，访问外部类的成员变量
           System.out.println(Outer.this.num);
       }
   }
}
