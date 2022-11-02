package Demo20;
//alt +/ 自动覆盖重写父类抽象类
public class Zi extends Fu {

	@Override
	public void method1() {
		
	}
  public void eat () {
	  System.out.println("吃饭");
  }
  public Zi() {
	  System.out.println("子类构造方法执行");
  }
}
