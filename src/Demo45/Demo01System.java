package Demo45;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        domo1();
        domo2();
    }




    //public static long currenTimeMillis();返回毫秒为单位的当前时间
    //练习用for循环打印数字1-9999所需要使用的时间（毫秒）
    private static void domo1() {
        //程序执行器，获取一次毫秒值
        long l = System.currentTimeMillis();

        for (int i = 1; i <= 99; i++) {
            System.out.println(i);
        }
        //程序执行后在获取一次毫秒值
        long l1 = System.currentTimeMillis();
        System.out.println("程序共耗时"+(l1-l));

    }

    //方法摘要
    //static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    //          从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。 
    //参数：
    //src - 源数组。
    //srcPos - 源数组中的起始位置。
    //dest - 目标数组。
    //destPos - 目标数据中的起始位置。
    //length - 要复制的数组元素的数量。

    //练习src数组中前三个元素，复制到dest数组的前三位置

    private static void domo2() {
        int [] arraySrc={1,2,3,4,5};
        int [] arrayDest={6,7,8,9,10};

        System.arraycopy(arraySrc,0,arrayDest,0,3);
        System.out.println(Arrays.toString(arrayDest));//【注意】
    }

}
