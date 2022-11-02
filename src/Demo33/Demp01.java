package Demo33;
/*
多态中成员变量的使用特点
 Zi 和 FU 都定义了num

口诀：
 成员变量，编译看左边，运行还看左边。
 成员方法，编译看左边，运行看右边

 成员变量不能覆盖重写，只有方法才能覆盖重写

 （以前知识）
 1，直接通过对象名称访问成员变量：看左边等号是谁，就优先用谁，没有则想上找，不会向下找
 2. 间接通过成员方法访问成员变量：看这个方法属于谁，优先用谁，没有则想上找，不会向下找
 */
public class Demp01 {
    public static void main(String[] args) {
        //用的多态的写法，父类引向子类对象
        Fu one =new Zi();  //左边等号是Fu，就优先用Fu
        System.out.println(one.num);  //fu的num  10  间接通过成员方法访问成员变量：看这个方法属于谁，
//       子类才有age，不会向下找，所有报错，
//        System.out.println(one.age);  //

        System.out.println("===========");
        //子类如果覆盖重写，就是子，20
        //子类没有覆盖重写，就是父 ，10
        one.showNum();


    }

}
