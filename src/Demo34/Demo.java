package Demo34;

public class Demo {
    public static void main(String[] args) {

        //首先创建一个笔记本电脑
        notebook notebook = new notebook();
        notebook.powerOn();   //开机
        System.out.println("============================");

        //创建一个usb设备，鼠标
        //多态写法，左父右子
        USB usb = new mouse();
        //参数是usb类型，我真好传递进去的就是usb鼠标
        notebook.UseDeive(usb);

      //【重点】创建一个usb键盘，
     keyboard keyboard =new keyboard();//没有用多态的写法
        //方法参数是usb类型，传递进去的是实现类对象
       notebook.UseDeive(keyboard); //这也正确,向上发生了向上转型（实现类--向上转型--接口）
//       notebook.UseDeive(new keyboard());//这样正确，使用子类匿名对象也是ok的
        System.out.println("============================");
           //鼠标点击，键盘输入。。。在notbook方法中实现了

        notebook.powerOff(); //关机
        System.out.println("============================");
      method(10.0); //正确写法 double--》 double
        method(20); //正确写法 int--》 double
        int a=30;
        method(30); //正确写法 int--》 double
    }
     //举例子
    public static void method(double num){
        System.out.println(num);
    }
}

