package Demo30;
// 4.如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类
//hsy：这里没有覆盖重写所有的抽象方法，就会报错，除非设置成抽象类（不能直接new）
public abstract class Myinterfaceabstract implements Demo06interfaceA,Demo06interfaceB{
    @Override
    public void methodA() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methoddefault() {
        System.out.println("对多个接口当中冲突的默认方法，进行了覆盖重写");
    }
}
