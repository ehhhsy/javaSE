package Demo76.demo01;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:10
 * @Description:通过对象名引用成员方法
    使用前提：对象名已经存在，成员方法也已经是存在的
    就可以使用对象名来引用成员方法
 */
public class main {
    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递lambda表达式
        printString(s->{
            //创建MethodRefObject对象
            MethodRefObject methodRefObject_1 = new MethodRefObject();
            //调用MethodRefObject对象的成员方法printUpString，把字符串大写输出
            methodRefObject_1.printUpString(s);
        });
        /**
         * 使用方法引用优化lambda
         * 对象已经存在了MethodRefObject
         * 成员方法printUpString也是已经存在了
         * 所以我们可以使用对象名::引用成员方法
         */
        //创建MethodRefObject对象
        MethodRefObject methodRefObject_1 = new MethodRefObject();
        printString(methodRefObject_1::printUpString);
    }
    //定义一个方法，方法参数传递一个Printable接口，
    public static void printString(Printable p){
        p.print("hello");
    }
}
