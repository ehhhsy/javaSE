package Demo65;
/*
    递归：方法字节调用字节
        递归的分类：
        递归分为两种，直接递归和间接递归
        直接递归称为自身调用字节。
        间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法
        注意事项：
            递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
            在递归中虽然有限定条件，但是递归次数【不能太多】，否则也会发生栈内存溢出
          递归的使用前提：
            当调用方法的时候，方法主体不变，每次调用方法的参数不同，可以使用递归
 */
public class Demo07 {
    public static void main(String[] args) {
//        a();
        b(1);
    }
//========================================================
//    public Demo07() {
//        Demo07();     构造方法不能递归
//    }

//========================================================
    private static void b(int i) {
        System.out.println(i);
//        if (i==100000){
//            return;//结束方法    递归次数【不能太多】
//        }
        b(++i);
    }
//========================================================
    private static void a() {
        System.out.println("a方法");
        a();//递归    停不下来，栈内存溢出
    }
}
