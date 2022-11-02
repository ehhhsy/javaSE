package Demo36.sub;
/*
还是要导包，是不同的包
 */
import Demo36.myClass;

public class MySon extends myClass {

    public void methodSon(){
        System.out.println(super.num);
    }
//    这个时候MyClass的num修饰符，改变即可证明【不同包子类】能否访问
//       当default int num..的时候，就不能范围
}
