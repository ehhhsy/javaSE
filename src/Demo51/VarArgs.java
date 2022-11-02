package Demo51;
/*
可变参数：
    使用前提：
    当方法的  参数的数据类型【确定了】  但是不知道要多少个参数 就可以用
    使用格式：
       ① 修饰符 返回值类型 方法名（数据类型... 参数名称）{}
       ② 修饰符 返回值类型 方法名（数据类型[] 参数名称）{}
     可变参数的原理：
        可变参数底层就是一个【数组】根据参数个数不同，会创建不同长度的数据，来存储
        传递的参数个数：可以是0，1，2，3，4.。。多个

    注意事项：
        1.一个方法的参数列表，只能有一个可变参数
            就是不能void method（int。。。a，int。。。b）{}  错误！！！
        2.如果方法的参数有多个，那么可变参数【必须写在末尾】
            void method（int。。a，int b，int c）{}    错误！！！必须写在末尾
            void method（int b，int c，int。。。a）{}    对了！

     小拓展，再看源码的时候，可变参数的终极写法：
     public static void method（object... obj）{}    无情。。。哈拉少
 */
public class VarArgs {
    public static void main(String[] args) {
        int i = Test();
        System.out.println(i);
        System.out.println("===============");
        System.out.println(Test2(10));
        System.out.println("===============");
        System.out.println(Test3(10,20,30,40,55));
        System.out.println("===============");
        System.out.println(Testsum(6,6,6,6,6,6));
    }


    private static int Test(int... arr) {
        System.out.println(arr);   //[I@10f87f48  底层是一个数据
        System.out.println(arr.length); //0         长度是0
        return 0;
    }
    private static int Test2(int... arr) { //给了我一个参数后。。。
        System.out.println(arr);   //[I@b4c966a  底层是一个数据
        System.out.println(arr.length); //1         长度是1
        return 0;
    }

    private static int Test3(int... arr) { //给了我5个参数后。。。
        System.out.println(arr);   //[I@2f4d3709  说明一直在创建数据
        System.out.println(arr.length); //5        长度是5
        return 0;
    }

    //    定义一个方法，计算0-n整数和的方法
    //    参数不知道呀，就用可变参数
    private static int Testsum(int... arr) { //传递几个参数都可以
         int sum=0;
        for (int i:arr
             ) {
           sum+=i; //【注意这里是i，不是arr[i]
        }
        return sum;
    }

}
