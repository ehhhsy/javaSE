package Demo37;
//内部类同名变量访问 +Outer
public class Demo02InnerClass {
    public static void main(String[] args) {
//        公式 外.内
    Outer.Inner inner =new Outer().new Inner();
    inner.methodInner();
    }
}
