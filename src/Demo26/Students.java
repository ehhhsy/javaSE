package Demo26;

public class Students {
    private String name;
    private int age;
    
    public Students() {
    	
    }
    public Students(String name,int age) {
    	System.out.println("�ҽ�  "+name+",�ҵ�������"+age);
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return name;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public int getAge() {
    	return age;
    }
}
