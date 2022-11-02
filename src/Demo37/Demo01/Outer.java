package Demo37.Demo01;
/*
如果一个类是定义在一个方法内部的，那么这就是一个【局部内部类】。
‘局部’：只有【当前所属的方法才能使用它】，除了这个方法外面就不能用了
   格式：
   修饰符 class 外部类名称{
     修饰符 返回值类型 外部类方法名称（参数列表）{
          class 局部内部类{
             //...
          }
     }
        }

        小结一下类的权限修饰符：
        public--》protected--》（default）--》private
        定义一个类的时候，权限修饰符规则：
        1.外部类：public/（default）
        2.成员内部类：public/protected/（default）/private
        3.成员内部类，【什么都不写】，不是default！！！！！！！！！

 */
public class Outer {
int num=1000;
    public void mehodOuter (){

        class  Inner{   //【局部内部类】这里就不用修饰符了
         int num=20;
         public  void methodInner(){
             System.out.println(num);
             System.out.println(Outer.this.num);
         }
        }
        //hsy:只有本类才可以创建对象
        //只有【当前所属的方法才能使用它】，除了这个方法外面就不能用了
      Inner inner=new Inner();
        inner.methodInner();
    }
 }
