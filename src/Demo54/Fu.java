package Demo54;
/*
   子父类的异常：
        如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者不抛出异常
        父类方法没有抛出异常，子类重写父类改方法不可抛出异常，此时子类产生该异常，只能捕获异常，不能声明抛出

   注意：
        父类异常时什么样，子类异常就什么样
 */
public class Fu {
    public void show01() throws  NullPointerException,ClassCastException{};
    public void show02() throws  IndexOutOfBoundsException{};
    public void show03() throws IndexOutOfBoundsException {};
    public void show04(){};



}

class Zi extends  Fu{


    @Override
    //子类重写父类方法时，抛出和父类相同的异常或者不抛出异常
    public void show01() throws NullPointerException, ClassCastException {};

    //子类重写父类方法时,抛出父类异常的子类
        @Override
        public void show02() throws ArrayIndexOutOfBoundsException {};

        //子类重写父类方法时,不抛出异常
    @Override
    public void show03() throws IndexOutOfBoundsException {};


//    父类方法没有抛出异常，子类重写父类改方法不可抛出异常，此时子类产生该异常，只能捕获异常，不能声明抛出
    @Override
    public void show04() {}
//    public void show04()throws Exception {}   报错


    //此时子类产生该异常,只能捕获处理(try.catch),不能声明抛出(throws)
    public void show4() {
        try {
            throw new Exception("编译期错误");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
