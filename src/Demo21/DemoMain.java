package Demo21;

public class DemoMain {
    public static void main(String[] args) {
//    	Animal animal =new Animal();����!!!!!!��Ϊ�����಻��ֱ��������
//    	Dog    dog =new Dog();      ����!!!!!!��Ϊ�����಻��ֱ��������
		
		Dog2Ha HH =new Dog2Ha();
		JinMao JM = new JinMao();
		
		HH.eat();
		HH.sleep();
		System.out.println("=========");
		JM.eat();
		JM.sleep();
	}
}
