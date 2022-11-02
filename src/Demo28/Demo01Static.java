package Demo28;

/*
static 修饰类属性的情况
 如果一个成员变量使用了static关键字，那么这个变量不在属于对象自己，
 而是属于所在的类，多个对象共享

 hsy：用static修饰room后，我只定义了one的room，没有定义two.room，
  但是two输出教室也是橘子三班，证明 【而是属于所在的类，多个对象共享】
 */
public class Demo01Static {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        one.room="橘子3班";
        System.out.println("姓名 "+one.getName()
                +" 年龄 "+one.getAge()+" 教室是 "+one.room+" 学号 "+one.getId());

        Student two = new Student("黄蓉",18);
        System.out.println("姓名 "+two.getName()
                +" 年龄 "+two.getAge()+" 教室是 "+two.room+" 学号 "+two.getId());


    }
}
