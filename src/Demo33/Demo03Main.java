package Demo33;
/*
  向上转型一定是安全的，没有问题的，正确的，但是也有一个弊端
  弊端：对象一旦向上转型，那么就无法调用子类原本特有的方法

  解决方案，用对象的向下转型【还原】。

  对象的向上转型,其实就是多态的写法
  Animal animal =new Cat();
 */
public class Demo03Main {
    //对象的向上转型，就是父类引用指向子类对象
    public static void main(String[] args) {
        Animal animal =new Cat();


        animal.eat();  //猫吃鱼
        //hsy：编译看左，左Animal并且有eat方法
//        运行看右，右是Cat,cat也有eat方法，没有则想上找

        //错误写法，一旦向上转型，那么就无法调用子类原本特有的方法
        //要用向下转型，还原动作
//        animal.catchMouse();


        //向下转型，进行还原动作
       Cat cat =(Cat) animal;
       cat.catchMouse();   //猫抓老鼠


        //错误的向下转型
        //你new的是Cat，不是dog所以不能向下转换
//        Dog dog =(Dog)Animal; 编译不会报错，类型转化异常

    }


}



