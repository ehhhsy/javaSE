package Demo64;

import Demo63.Person;

import java.util.Arrays;

import static Demo64.Demo01Calculator.incokeCalc;

/*
lambda表达式：是可推导，可以省略
    凡是根据上下文推导出来的内容，都可以省略书写
    可以省略的内容：
        1.（参数列表）：括号总参数列表的数据类型，可以省略不写
        2.（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
        3.{一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略{}，return，分号
            注意：要省略，只能一起省略
 */
public class Demo02 {
    public static void main(String[] args) {
        Person[] arr= {
                new Person("小王", 11),
                new Person("函数", 13),
                new Person("惠普", 1),
        };
                //使用匿名内部类的方式，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "多线程任务==");
            }
        }).start();

        //使用lambda表达式，实现多线程
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        }).start();

        //省略lambda表达式，写法
        new Thread(()->System.out.println(Thread.currentThread().getName() + "多线程任务==")).start();


        //使用lambda表达式，简化
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()- o2.getAge();
        });
        for (Person a:arr
             ) {
            System.out.println(a);
        }


        //使用lambda表达式，简化省略
        Arrays.sort(arr,(o1, o2)->o1.getAge()- o2.getAge());  //省略了（）的数据类型，{}的return ，分号 ，{}
        for (Person a:arr
        ) {
            System.out.println(a);
        }

        //使用lambda表达式，简化
        incokeCalc(10,20,(int a,int b)->{
            return a+b;
        });


        //使用lambda表达式，简化省略
        incokeCalc(10,20,( a,b)->a+b);  ////省略了（）的数据类型，{}的return ，分号 ，{}


    }
}
