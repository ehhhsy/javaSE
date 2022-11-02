package Demo51;
/*
哈希值：是一个十进制的整数，由系统随机生成的
（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际的地址值）
在Object类有一个方法，可以获取对象的哈希值

 hashCode方法的源码：
 public native int hasCode（）；
 native：代表该方法调用的是本地操作系统的方法
 */
public class Demo02 {
    public static void main(String[] args) {
      //person类默认继承了object类，可以使用object类的hasCode方法
        person person1 = new person();
        int i = person1.hashCode(); //返回一个10进制整数
        System.out.println(i);//189568618

        person person2 = new person();
        System.out.println(person2.hashCode());//793589513


        System.out.println(person1);//Demo51.person@b4c966a   hsy:这个b4c966a是16进制，转化成10进制就是189568618
        System.out.println(person2);//Demo51.person@2f4d3709  hsy：这个2f4d3709是16进制，转化成10进制就是793589513

        /*
        String类的哈希值
            String类重写Object类的hasCode方法
         */
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

         //哈希值相同的String类对象,字符串虽然不一样，但是哈希值是一样的,巧合
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

    }
}
