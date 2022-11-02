package Demo76.Demo03;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:49
 * @Description:
 */
public class man extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello,我是man");
    }
    //定义一个方法，参数传递Greetable接口
    public void method(Greetable greetable){
        greetable.greet();
    }
    public void show(){
        //调用method方法，方法参数是一个Greetable接口函数式接口，所以可以传入lambda
        method(()->{
            //创建一个父类
            Human human = new Human();
            human.sayHello();
        });
        /**
         * 优化lambda表达式
         * super是已经存在的
         * 父类的成员方法sayHello也是已经存在的
         * 所以可以使用super引用父类的sayhello
         */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new man().show();
    }
}
