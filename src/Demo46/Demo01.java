package Demo46;

/*
 包装类  举例integer
 装箱：把基本类型的数据，包装到包装类中（基本类型-》包装类）
 【构造方法】：
 Integer(int value)
          构造一个新分配的 Integer 对象，它表示指定的 int 值。
Integer(String s)
          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
          【注意】，传递的字符串，必须【内容是是基本类型】的字符串，否则会抛出异常“100”正确  “a”错误，异常
           hsy:就是说这个字符串只能”123“...，不能"大撒大撒大苏打saa"
 【静态方法】：
static Integer valueOf(int i)
          返回一个表示指定的 int 值的 Integer 实例。
static Integer valueOf(String s)
          返回保存指定的 String 的值的 Integer 对象。
          hsy:就是说这个字符串只能”123“...，不能"大撒大撒大苏打saa"

  拆箱：在包装类中取出基本类下的数据（包装类--》基本类型的数据）
  【成员方法】：
  int intValue()
          以 int 类型返回该 Integer 的值。



 */
public class Demo01 {
    public static void main(String[] args) {
        //Integer(int value)
        int a = 10;
        Integer integer1 = new Integer(a);
        System.out.println(integer1); //打印对象，10，说明重写了toString方法

        //Integer(String s)
        System.out.println(new Integer("123")); //匿名对象写法

//     【静态方法】
//        static Integer valueOf(int i)
        Integer integer2 = Integer.valueOf(2211);

//        static Integer valueOf(String s)
        Integer integer3 = Integer.valueOf("123");
        System.out.println(integer3);
//=======================================================================================
        System.out.println("====================");
        //拆箱
        int i = integer1.intValue();
        System.out.println(i);
    }
}
