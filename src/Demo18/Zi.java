package Demo18;

public class Zi extends Fu{
   int num=205;
   @Override
   public void method() {
	   super.method();//�����˸��෽��
	   System.out.println("���෽��");
   }
   public void show() {
	   int num=100;
	   System.out.println(num);
	   System.out.println(this.num);
	   System.out.println(super.num);
   }
}
