package Demo09;
/*�Զ�����set/get    source===Generate Getters and Setters
 * �Զ����ɣ����췽��                        source===Constructor using fieds
 * һ����׼����ͨ��Ҫ���������ĸ���ɲ���
 * 
 * 1. ���еĳ�Ա������Ҫ��private�ؼ�������
 * 2.���еĳ�Ա������Ҫ��дһ��getter/seterr����
 * 3.Ҫдһ���޲������췽��
 * 4.Ҫдһ���вι��췽��
 */
public class Student {
      private String name; //����
      private int age; //����
     /* public Student() {
    	  System.out.println("�޲ι��췽��ʵ����");
      }
     /* public Student(String name,int age) {
    	  System.out.println("ȫ�ι��췽��ʵ����");
    	  this.name=name;
    	  this.age=age;
      }
     /* public void setName( String name) {
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
      }*/
      //���¶����Զ����ɵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Student() {
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
}
