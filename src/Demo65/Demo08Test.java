package Demo65;
/*
    练习··不推荐使用递归
        使用递归计算1-n之间的和       原理看图io流
 */
public class Demo08Test {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);
        int i = sum_two(20);
        System.out.println(i);
    }
//    ===================================================
    /*
              定义一个方法计算1-n之间的和
              1+2+3....+n==n+(n-1)+(n-2)+...+1
              已知：
                   最大值：n
                   最小值：1
              使用递归必须明确：
               1.递归的结束条件
                   获取到1的时候 结束
               2.递归的目的
                   获取下一个被加的数字（n-1）
        */
    private static int sum(int n) {
        if (n==1){
            return 1;
        }
//        获取下一个被加的数字（n-1）
            return n+sum(n-1);
    }
    public static int sum_two(int f){
        if (f==1){
            return 1;
        }
        return f+sum_two(f-1);

    }
}
