package Demo08;
//构造方法重载：更多方式创建对象
public class test2 {
    String color;
    int price;
    int seat;

    public test2(String color, int price, int seat) {
//        this.color = color;  写法1
//        this.seat = seat;
        this(color, seat);    //写法2  this 还可以调用当前类中其他的方法
        this.price = price;

    }
    //构造方法的重载，有些东西没有price
    public test2(String color,int seat){
        this.color=color;
        this.seat=seat;
    }

    public static void main(String[] args) {
        test2 baoma = new test2("蓝色",200000,4);//用的第一个构造方法
        test2 huangyan_pai = new test2("黄色",20);    //用的第二个构造方法
    }

}
