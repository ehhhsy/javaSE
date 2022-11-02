package Demo48;
/*
定义一个含有泛型的类，模拟ArrayList集合    cs:demo02
我也不知道，我这个类用什么数据类型，就用泛型
 */
public class Generic<E> {   //hsy定义类的话，【泛型就在类名称后面】
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
