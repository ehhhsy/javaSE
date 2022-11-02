package Demo29;
//计算在-10.8到5.9之间，绝对值大于6 或者小于2.1的整数有多少个？
public class test_2022 {
    public static void main(String[] args) {
        double d=4.2;
        double min=-10.8;
        double max=5.9;
        int count = 0;
        double min_abs = Math.abs(min);
        double max_abs = Math.abs(max);
        if(max_abs>6 || max_abs<2.1) {
            count+=1;
        }
        int sum_abs=(int)(max_abs+min_abs);
        System.out.println(sum_abs);

    }
}
