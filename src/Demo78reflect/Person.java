package Demo78reflect;

/**
 * @Author: hsy
 * @Date: 2022/10/20/19:14
 * @Description:
 */
public class Person {
    private String name;
    private int age;

    //È«¶¼²âÊÔ
    public String address;
    protected String b;
     String c;
    private String d;


    public void eat(String food){
        System.out.println("eat....."+food);
    }
    public void sleep(){
        System.out.println("sleep.....");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
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
