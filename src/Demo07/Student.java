package Demo07;
/*
 * ���ڻ������͵��е�booleanֵ��getter����һ��Ҫд��isXxx��ʽ����setXxx���򲻱�
 */
public class Student {
   private String name;
   private int age;
   private boolean male; 
   
   public void setName(String num0) {
	   name=num0;
   }
   public String getName() {
	   return name;
   }
   
   public void setAge(int num2) {
	   age=num2;
	   
   }
   public int getAge() {
	   return age;
   }
   
   public void setMale(boolean z) {
	  
	   male=z;
   }
   public boolean isMale() {
	   return male;
   }
}
