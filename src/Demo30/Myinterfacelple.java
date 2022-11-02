package Demo30;
// 2.一个类的直接父类是唯一的，但是一个类同时实现多个接口
public class Myinterfacelple implements Demo06interfaceA,Demo06interfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖从写了A方法");
    }

    @Override
//     3.如果实现类实现的多个接口当中，存在重复的抽象方法，那么只需要重写一次即可。
    public void methodAbs() {
        System.out.println("覆盖从写了A,B接口都有的抽象方法");
    }

    @Override
    public void methoddefault() {
        System.out.println("对多个接口当中冲突的默认方法，进行了覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖从写了B方法");
    }


}
