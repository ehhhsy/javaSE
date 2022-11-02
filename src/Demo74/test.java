package Demo74;

/**
 * 函数式接口的使用：一般作为方法的参数和返回值类型
 */
public class test {
    public static void main(String[] args) {
        //调用show方法,方法的参数是一个接口，所以可以传递接口的实现类！！！
        show(new Demo01Impl());

        //调用show方法，方法的参数是一个接口,所以我们可以传递接口的匿名内部类
        show(new Demo01() {
            @Override
            public void say() {
                System.out.println("2222222");
            }
        });
        //调用show方法，方法的参数是一个函数式接口,可以使用lambda表达式
        show(()-> System.out.println("33333333"));
    }

    private static void show(Demo01 myInterface) {
        myInterface.say();
    }
}
