package Demo33;
/*
在多态的代码中，成员方法的访问规则是：
  看new的是谁，就优先用谁

 【成员方法的使用口诀：编译看左边，运行看右边。】
 hsy:这边的左是Fu one就是fu  ，右是new Zi();就是zi    看下面的栗子


 对比一下：
 成员变量，编译看左边，运行还看左边。
 成员方法，编译看左边，运行看右边
 */
public class Demo02method {
    public static void main(String[] args) {
        Fu one =new Zi();
        one.method();  //父子都有，优先用子
        one.methodFu(); //子类没有，父类有，向上找到父类    父类特有方法


        //编译看左，左边是Fu，Fu当中没有methodZi方法，所以编译报错
        //one.methodZi(); 编译报错，错误写法！！



//        举例子，刚才的one.method();
//         编译看左，左是Fu，Fu有method方法
//         真正运行看右，右是Zi，当然运行子类啦，子类有

//           下一个例子one.methodFu();
//           编译看左，左是Fu，Fu有methodFu方法
        //    真正运行看右，右是Zi，当然运行子类，子类没有，父类有，向上找到父类
    }
}
