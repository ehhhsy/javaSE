package Demo65;
/*
    ��ϰ�������Ƽ�ʹ�õݹ�
        ʹ�õݹ����1-n֮��ĺ�       ԭ��ͼio��
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
              ����һ����������1-n֮��ĺ�
              1+2+3....+n==n+(n-1)+(n-2)+...+1
              ��֪��
                   ���ֵ��n
                   ��Сֵ��1
              ʹ�õݹ������ȷ��
               1.�ݹ�Ľ�������
                   ��ȡ��1��ʱ�� ����
               2.�ݹ��Ŀ��
                   ��ȡ��һ�����ӵ����֣�n-1��
        */
    private static int sum(int n) {
        if (n==1){
            return 1;
        }
//        ��ȡ��һ�����ӵ����֣�n-1��
            return n+sum(n-1);
    }
    public static int sum_two(int f){
        if (f==1){
            return 1;
        }
        return f+sum_two(f-1);

    }
}
