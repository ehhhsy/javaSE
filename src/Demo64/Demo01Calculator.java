package Demo64;
/*
//        incokeCook(()->{});   格式    【重点】
    lambda表达式有参数有返回值的练习
    需求：
        给定一个计算器Calculator接口，内含抽象方法invokeCalc可以将两个int数字相加得到和值
        给lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo01Calculator  {
    public static void main(String[] args) {
        //调用invokeCalc方法 匿名内部类
        incokeCalc(130, 140, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //使用lambda表达式简化代码 30
        incokeCalc(10,20,(int a,int b)->{
            return a+b;
        });
    }
    /*
            定义一个方法
            参数传递两个int类型的整数
            参数传递Calculator接口
            方法内部调用Calculator中的方法calc计算整数的和
          */
    public static void incokeCalc(int a,int b,Calculator calculator){
        int sum= calculator.calc(a,b);
        System.out.println(sum);
    }


}
