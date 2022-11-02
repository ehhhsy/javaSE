package Demo21;

public class DemoMain {
    public static void main(String[] args) {
//    	Animal animal =new Animal();错误!!!!!!因为抽象类不能直接拿来用
//    	Dog    dog =new Dog();      错误!!!!!!因为抽象类不能直接拿来用
		
		Dog2Ha HH =new Dog2Ha();
		JinMao JM = new JinMao();
		
		HH.eat();
		HH.sleep();
		System.out.println("=========");
		JM.eat();
		JM.sleep();
	}
}
