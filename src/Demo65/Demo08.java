package Demo65;
/*
        ʹ�õݹ�ĺô���
            ǰ�ᣬ�������岻�䣬���������仯���ʺ��õݹ�
    ��ϰ��
        ʹ�õݹ����׳�
        n�Ľײ㣺n��=n*��n-1��*������3*2*1

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
    ʹ�÷���ʹ�õݹ����׳�
    5�Ľ׳ˣ�5��=5*��5-1��*��5-2��*��5-3��*��5-4��=5*4*3*2*1
     �ݹ����������
        ��ȡ��1��ʱ�����
     �ݹ��Ŀ��
        ��ȡ��һ�����˵����֣�n-1��
     */
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n*sum(n-1);
    }
}
