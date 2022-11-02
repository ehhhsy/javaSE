package Demo38;
/*
如果接口的实现类（或者父类的子类）只需要使用唯一的一次。
那么这种情况就可以省略该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：
接口名称 对象名 =new 接口名称(){
  //覆盖重写所有的抽象方法
}

对格式进行解析 ”new 接口名称{。。。}“
1.new代表创建对象的动作。
2.接口名称就是匿名内部类需要实现哪个接口
3.{..}这才是匿名内部类的内容

另外注意几点问题：
1.匿名内部类，在创建对象的时候，只能使用【唯一一次】。
如果【希望多次创建对象】，而且类的内容一样的化，那么就必须使用单独定义的实现类
hsy： 多次创建对象,要么多写一遍匿名内部类，要么创建个学生类

2.匿名对象，在【调用方法】的时候。只能调用唯一一次。

3.匿名内部类是省略了【实现类/子类】。但是匿名对象是省略了【对象名称】
 */
public class Demo01Main {
    public static void main(String[] args) {
//        MyinterfaceImpl one =new MyinterfaceImpl();//一般写法
//        one.method();

//      Myinterface two =new MyinterfaceImpl(); //多态写法
//        two.method();


        //使用匿名内部类,不是匿名对象,对象名叫three
        Myinterface three = new Myinterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了-111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了-222-A");

            }
        };
        three.method1();
        three.method2();

        System.out.println("============================================");
        ////使用匿名内部类,而且是匿名对象,对象名没有，省略了对象名
        new Myinterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了-111-B");

            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了-222-B");
            }
        }.method2();  //注意这里
        //2.匿名对象，在【调用方法】的时候。只能调用唯一一次。
        //只有调用一次，或者在创建一个匿名内部类的匿名对象

    }
}
