package Demo45;

import java.util.Arrays;

/*StringBuilder【构造方法】
StringBuilder()
          构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符
StringBuilder(String str)
          构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class Demo02StringBuider {
    public static void main(String[] args) {
        //构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println("里面有" + stringBuilder1);

//        StringBuilder stringBuilder2 = new StringBuilder("aaa","bbb");//不能多个添加
        StringBuilder stringBuilder3 = new StringBuilder("aaa");
        System.out.println(stringBuilder3);


        //【成员方法】
//        StringBuilder append(。。。)
//        将 添加【任意类型数据】的字符串形式，并返回自身对象

        //使用append方法往里添加数据
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(111);
//        stringBuilder4.append(2.33,22.1);//
        stringBuilder4.append(2.33);
        stringBuilder4.append(" 其假期");

        /*
        链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
         */
//        可以这样写
        stringBuilder4.append(1).append(233.1).append(true);

        System.out.println(stringBuilder4);

        //数组反转
        stringBuilder4.reverse();
        System.out.println(stringBuilder4);

    }
}
