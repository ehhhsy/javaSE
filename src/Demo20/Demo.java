package Demo20;
//alt +/ 自动覆盖重写父类抽象类
public class Demo {
  public static void main(String[] args) {
	Zi zi =new Zi();
	zi.eat();
	//父类构造方法
	//子类构造方法执行
	//吃饭
	//因为父类是abstract，所以只能通过子类的构造方法，
	//系统赠送的super（）；       去调用它

}
}
