package demo01;

//���巽������Ҫ��
//�費�������
//��ϰ������һ���������1-100�ĺ�ֵ2020.6.8   2020.9.13
public class FANGfa {
    public static void main(String[] args) {
        sum(); //��������
        printNIHAO(3);
        zzz();   //��д��continue
        System.out.println("===============");


        int h = 1;
        while (h < 3) {                                 //while ��ϰ
            System.out.println("while" + h);
            h++;
        }
        int s = 6;                                    //do-while ������
        do {
            System.out.println("do-whlieһ��Ҫִ��һ��" + s);
            s++;
        }
        while (s < 10);
        int y = 1; //��ʼ�����
        do {
            System.out.println("do====while ��ϰ2  " + y);  //ѭ����
            ++y;
        }
        while (y < 3);

        int n = 8;
        do {
            System.out.println("do-while ��ϰ3  " + (7 + n));   //�������ŵĻ�,�ͻ���do-while ��ϰ3  78����Ϊ�ַ�����int�������ַ���
            ++n;
        } while (n < 10);

        System.out.println("====================");
        Demo01();
        Demo02(50);
        System.out.println(Demo03(50,100));
        
    }

    private static int Demo03(int a,int b) {
        for (int i = 1; i <= b; i++) {
                a+=i;
        }
        return a;
    }

    private static void Demo02(int a) {
        int n=0;
        for (int i = 1; i <= a; i++) {
            n+=i;
        }
        System.out.println(n);
    }

    private static void Demo01() {
        int n=0;
        for (int i = 1; i <= 100; i++) {
            n+=i;
        }
        System.out.println(n);
    }
    
    

    public static void sum() {
        int mmm = 0;
        for (int i = 1; i <= 100; i++) {
            mmm += i;
        }
        System.out.println(mmm);
    }

    //��ӡָ�����������

    /*public static int cs (int a) {

        for(int i =0;i<a;i++) {
            System.out.println("���"+i);
        }
        return a;
       */
    public static void printNIHAO(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("���" + i);
        }
    }

    public static void zzz() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {  //����
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

}

