package Demo08;
/*有什么用呢：用途就是来创建对象的
 * 全参数的构造方法作用只是在创建对象的时候，更加方便我们将现成的数据 ，=========
 * 通过参数的形式设置进来，而省去你多次调用set。。的方法，需改对象内容还是用set方法
 * 构造方法是专门用来创建对象的方法，当我们通过关键字来创建对象的时候，其实就是调用构造方法
 * 
 * 注意事项：很重要=================================================================
 * 1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
 * 2.构造方法不要写返回值类型，连void都不写
 * 3.构造方法，不能return一个具体的放回值
 * 4. 如果没有编写任何构造方法，
 * 那么编译器将会默认赠送一个构造方法，没有参数，方法体什么事情都不做
 * 如：public Student(){}
 * 5.一旦编写了至少一个构造方法，那么编译器将不再赠送 
 * 6.构造方法也是可以重载的，    方法名称相同，参数列表不相同
 */
public class Student {  //↓就是标准的学生类
	
             //成员变量
        	  private String name;
        	  private int age;
        	  
        	  //无参数构造方法
        	  public Student() {  //Student one =new Student(); 一样的
        	  System.out.println("无参构造方法执行了");
         }   
        	  //全参构造方法   把"黄老邪",32  （name，age）传给this.name
        	  //set还是有用的，可以用来筛选
        	  public Student(String name,int age) {
        		  System.out.println("全参构造方法执行了");
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

