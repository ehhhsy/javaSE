package Demo30;
  /*
    接口的默认方法，可以通过接口实现类对象，直接调用 a.methoddefault();
    接口的默认方法，也可以被接口实现类进行覆盖重写。
    hsy：第二条就是说：我可以从写默认方法写上新的内容，看MyinterfaceDefaultA
   */

public class Demo03interface {
    public static void main(String[] args) {
            MyinterfaceDefaultA a= new MyinterfaceDefaultA();

            a.methodAbs();

            //调用默认方法，如果实现类当中没有，会向上找接口的
            a.methoddefault();  //接口的默认方法，可以通过接口实现类对象，直接调用

            MyinterfaceDefaultB myinterfaceDefaultB =new MyinterfaceDefaultB();
        //调用默认方法，如果实现类当中没有，会向上找接口的
            myinterfaceDefaultB.methoddefault();
            myinterfaceDefaultB.methodAbs();

    }

 }
