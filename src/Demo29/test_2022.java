package Demo29;
//������-10.8��5.9֮�䣬����ֵ����6 ����С��2.1�������ж��ٸ���
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
