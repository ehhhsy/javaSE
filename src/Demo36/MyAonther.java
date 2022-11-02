package Demo36;

//和Myclass只是邻居关系，没有继承
public class MyAonther {

    public void antherMethod() {

        System.out.println(new myClass().num);

//      这个时候MyClass的num修饰符，改变即可证明【同一个包】能否访问
//       当private int num..的时候，就不能范围
    }
}
