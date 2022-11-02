package Demo39;
/*
 类作为成员变量的类型 LOL
  */
public class LOL {
     private String name;  //名字   String就是一个类
    private int age;  //英雄年龄
    private Weapon weapon; //武器

    public void attack(){
        System.out.println("年龄是"+age+"的"+name+"用"+weapon.getCode()+"攻击");
    }

    public LOL(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public LOL() {
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
