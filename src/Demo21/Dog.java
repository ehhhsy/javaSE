package Demo21;
//
//子类也是一个抽象类
public  abstract class Dog extends Animal{

	@Override
	public void eat() {
           	System.out.println("吃骨头");	
	}

	@Override
	 public abstract void sleep();

        
}
