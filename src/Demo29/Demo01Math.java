package Demo29;
  /*
    java.util.Math������ѧ��صĹ����࣬�����ṩ�����ľ�̬�������������ѧ������صĲ���
     hsy:����ȡ��,����ȡ��,�������� ���ǹ���С���ģ�

    public static double abs(double num):  ��ȡ����ֵ
    public static double ceil(double num): ����ȡ��
    public static double floor(double num�� ����ȡ��
    public static long round (double num)   ��������

    Math.PI�������Բ���ʳ�����double��  System.out.println(Math.PI);
   */
public class Demo01Math {
      public static void main(String[] args) {
         double a =-2322.21;
         double abs =Math.abs(a);
          System.out.println(abs);  //  ��ȡ����ֵ  2322.21   ���ǹ���С���ģ�

          System.out.println("==========");

          double b=53.2;
          double ceil=Math.ceil(b);
          System.out.println(ceil);    //����ȡ��   54.0   ���ǹ���С���ģ�


          System.out.println("==========");

         double c=69.1;
         double flooar =Math.floor(c);
          System.out.println(flooar);  // ����ȡ��  69.0   ���ǹ���С���ģ�
          System.out.println(Math.floor(30.1));
          System.out.println(Math.floor(30.9));
          System.out.println(Math.floor(30.0));


          System.out.println("==========");
          double d =54.2;
          double e=42.9;
          double d1=Math.round(d);
          double e1=Math.round(e);
          System.out.println(d1);    //54.0   //��������   ���ǹ���С���ģ�
          System.out.println(e1);    //43.0
          System.out.println(Math.round(38));  //38 �������뻹��38

          System.out.println(Math.PI);

          System.out.println("================2020.11.11");
          double shy=-113.231;
          System.out.println(Math.abs(shy));  //113.231
          System.out.println(Math.ceil(shy)); //-113.0
          System.out.println(Math.floor(shy)); //-114.0
          System.out.println(Math.round(shy)); //-113
      }
}
