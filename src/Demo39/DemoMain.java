package Demo39;
/*
类作为成员变量的类型  例子
 */
public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        LOL king =new LOL();
        king.setAge(2000);
        king.setName("龙王");


        //创建一个武器对象;
        Weapon weapon =new Weapon("AK-47");

        //为英雄配置武器
       king.setWeapon(weapon);

       //
       king.attack();


    }
}
