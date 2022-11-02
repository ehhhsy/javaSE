package Demo32;
/*
  什么叫多态：左父右子就是多态
  面向对象三大特征：封装性，继承性，多态性
  extends继承或者implements实现，是多态性的【前提】。
   （ 有可能是接口与接口之间的继承，类与接口的实现，....产生上写关系）

    代码当中体现多态性，其实就是一句话，【父类应用指先子类对象】
    格式：
    父类名称 对象名 =new 子类名称();
    或者
    接口名称 对象名 =new 实现类名称（）;
   */
public class Demo01Multi {
    public static void main(String[] args) {
        Fu one =new Zi();
        //（以前知识）
        one.method();  ///父子都有一样的方法 new的是谁，用的就是谁   子类方法

        one.methodFu(); //父类公有方法 子类没有就想上找 （以前知识）
    }

    }

