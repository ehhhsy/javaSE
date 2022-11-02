package Demo21.test_2022;

public class dog extends Animals {
    private String name;
    private int age;

    @Override
    public void say() {
        System.out.println("ao ! ao! ao!");
    }

    @Override
    public void eat() {
        System.out.println("eating dog_food");
    }

    public dog() {
    }
    public dog(String name,int age){
        this.name=name;
        this.age=age;
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

    public void DogToRun(){
        System.out.println(this.name+" are running");
    }
    public void intrude(){
        System.out.println("this is "+this.name+",come to say hello");
    }
}
