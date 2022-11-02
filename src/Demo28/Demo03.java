package Demo28;
/*
静态变量的内存图       看图
 */
public class Demo03 {

    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称调用
        Student.room="火箭101教室";

        Student one =new Student("王大哈",15);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Student.room);
        /* 静态变量，多个对象共享，用类名称。静态变量调用 */


        System.out.println("====================");

        Student two =new Student("王大爷",50);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);
        /* 静态变量，多个对象共享，用类名称。静态变量调用 */
    }
}
