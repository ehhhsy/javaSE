package Demo08;
/*��ʲô���أ���;���������������
 * ȫ�����Ĺ��췽������ֻ���ڴ��������ʱ�򣬸��ӷ������ǽ��ֳɵ����� ��=========
 * ͨ����������ʽ���ý�������ʡȥ���ε���set�����ķ�������Ķ������ݻ�����set����
 * ���췽����ר��������������ķ�����������ͨ���ؼ��������������ʱ����ʵ���ǵ��ù��췽��
 * 
 * ע���������Ҫ=================================================================
 * 1.���췽�������Ʊ�������ڵ���������ȫһ����������СдҲҪһ��
 * 2.���췽����Ҫд����ֵ���ͣ���void����д
 * 3.���췽��������returnһ������ķŻ�ֵ
 * 4. ���û�б�д�κι��췽����
 * ��ô����������Ĭ������һ�����췽����û�в�����������ʲô���鶼����
 * �磺public Student(){}
 * 5.һ����д������һ�����췽������ô���������������� 
 * 6.���췽��Ҳ�ǿ������صģ�    ����������ͬ�������б���ͬ
 */
public class Student {  //�����Ǳ�׼��ѧ����
	
             //��Ա����
        	  private String name;
        	  private int age;
        	  
        	  //�޲������췽��
        	  public Student() {  //Student one =new Student(); һ����
        	  System.out.println("�޲ι��췽��ִ����");
         }   
        	  //ȫ�ι��췽��   ��"����а",32  ��name��age������this.name
        	  //set�������õģ���������ɸѡ
        	  public Student(String name,int age) {
        		  System.out.println("ȫ�ι��췽��ִ����");
        		  this.name=name;
        		  this.age=age;
        		  
        	  }
        	  //getter setter 
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

