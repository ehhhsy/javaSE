package Demo28;
/*
   一旦使用static修饰成员方法，那么就成为静态方法.
   【静态方法不输入对象，而是属于类的】
    hsy：不是属于one的，而是属于类（Myclass的）

   如果没有static关键字，那么必须创建对象，然后通过对象使用它
   有static关键字，那么不需要创建对象，直接就能通过类名称来使用他

   小结
   无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用
   静态变量：类名称。静态变量
   静态方法：类名称。静态方法（）;

   注意事项：
   【1.静态方法不能直接访问非静态变量】   hsy：看Myclass类
   原因是：因为内存中【先】有的静态内容，【后】有的非静态内容
   【2.静态方法中不能用this。】
   原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。hsy:静态和对象没关系！

 */
public class Demo02methodStatic {
    public static void main(String[] args) {
        //没有static关键字的内容
        Myclass one =new Myclass();
        one.method();

        System.out.println("==============");
        //对于静态方法来说，额可以通过对象名进行调用，也可以直接通过类名称来调用
        //这种写法在编译之后也会被javac翻译成为“ 类名称。静态方法（）；
        Myclass.methodStatic();  //正确，推荐,容易让人误解成成员方法
        one.methodStatic();      //正确，不推荐


        //对于本类当中的静态方法，可以省略类名称
        method();
//会翻译成为 Demo02methodStatic
    }

    public  static  void method(){
        System.out.println("自己的方法");
    }

}
