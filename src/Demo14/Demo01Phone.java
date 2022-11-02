package Demo14;
 //覆盖重写典型应用
public class Demo01Phone {
	public static void main(String [] args) {
    FuPhone phone =new FuPhone();
    phone.call();
    phone.send();
    phone.show();
    System.out.println("=========");
    ZiPhone phone1 =new ZiPhone();
    phone1.call();
    phone1.send();
    phone1.show();
}
}