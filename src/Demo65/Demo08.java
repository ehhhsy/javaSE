package Demo65;
/*
        使用递归的好处：
            前提，方法主体不变，参数方法变化，适合用递归
    练习：
        使用递归计算阶乘
        n的阶层：n！=n*（n-1）*。。。3*2*1

 */
public class Demo08 {
    public static void main(String[] args) {
        int i = sum(5);
        System.out.println(i); //120
        System.out.println("======================");
        System.out.println(a(6));
        System.out.println(sum_n(10));
    }

    private static int a(int n) {           //2020.9.20
        if (n==1){
            return 1;
        }
        return n*a(n-1);
    }
    public static int sum_n(int n){         //2020.9.20
        if (n==1){
            return 1;
        }
        return n+(sum_n(n-1));
    }
    /*
    使用方法使用递归计算阶乘
    5的阶乘：5！=5*（5-1）*（5-2）*（5-3）*（5-4）=5*4*3*2*1
     递归结束的条件
        获取到1的时候结束
     递归的目的
        获取下一个被乘的数字（n-1）
     */
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n*sum(n-1);
    }
}
