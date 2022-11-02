package Demo30;

public class MyinterfaceDefaultA implements MyinterfaceDefault{
    @Override
    public void method() {

    }

    @Override
    public void methodAbs() {
        System.out.println("aaa");
    }


    public void methodbb() {

        System.out.println("实现了抽象方法，bbb");
    }

    @Override
    public void methoddefault() {
        System.out.println("默认方法被MyinterfaceDefaultA重写");
    }
}
