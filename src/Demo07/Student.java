package Demo07;
/*
 * 对于基本类型当中的boolean值，getter方法一定要写出isXxx形式，而setXxx规则不变
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
