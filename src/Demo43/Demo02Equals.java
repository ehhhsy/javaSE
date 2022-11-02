package Demo43;
//equals 类

public class Demo02Equals {
    public static void main(String[] args) {
/*         person类默认继承了object类，所以可以使用object的equals方法
    boolean  equals(Object obj)  指示其他某个对象是否与此对象“相等”。

         object类equals方法源码：
              public boolean equals(Object obj) {
        return (this == obj);
          参数：object obj可以传递任意的对象
          方法体：
          ==比较运算符，返回的就是一个布尔值true，false
          基本数据类型：比较的是值
          引用数据类型：比较的是【对象的地址值】
          this就是谁调用就是谁的 object是参数，
    }
 */
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
//        Person p2 = new Person("古力娜扎",18);

        boolean equals = p1.equals(p2);
        System.out.println(equals);//false
    }
}
