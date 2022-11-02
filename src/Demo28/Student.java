package Demo28;

public class Student {
    private int id;
    private String name;  //姓名
    private  int age;  //年龄

    //实现id号每new一次加一
    private static  int  idCounter=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static String room;   //定义静态变量
    public Student(){
        this.id=++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;      //实现id号每new一次加一
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
