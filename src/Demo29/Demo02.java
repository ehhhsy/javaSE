package Demo29;
  //��ͼ
/*           NICE,HSY
   ��Ŀ��
   ������-10.8��5.9֮�䣬����ֵ����6 ����С��2.1�������ж��ٸ���

   ˼·��
   1.��Ȼȷ���˷�Χ��forѭ��
   2.���λ��-10.8Ӧ��ת����Ϊ-10�����ַ�����
      2.1����ʹ��Math.ceil����������ȡ�� ���-10
      2.2ǿ��ת����Ϊint���Զ���������С��λ
   3.ÿһ�����ֶ������������Բ������ʽӦ����num++;����ÿ�ζ���+1��
   4.����õ�����ֵ��Math.abs����
   5.һ��������һ�����֣���Ҫ�ü�����++����ͳ��

   ��ע�����ʹ��Math.ceil������-10.8���-10.0��ע��doubleҲ�ǿ���++��
 */
public class Demo02 {
      public static void main(String[] args) {

          int sum=0;
          double max=5.9;
          double min=-10.8;
          for (double i=min; i <max ; i++) {
              double v = Math.ceil(Math.abs(i));
              if (v>6||v<2.1){
                  sum+=1;
              }
          }
          System.out.println("2020.11.11 һ����"+sum);




        /*  int count = 0;                 //������  ����1
          double min = -10.8;
          double max = 5.9;
          for (int i = (int) min; i < max; i++) { //����������������������е�����
              int abs = Math.abs(i);       //-10.8��5.9֮�����е�����
              if (abs > 6 || abs < 2.1) {       //ɸѡ
                  count++;
              }
          }
          System.out.println("�ܹ��� " + count);  //�ܹ��� 9
*/

//         int count =0;          //����2
//          double min =-10.8;
//          double max =5.9;
//          double da =Math.ceil(max);   //֮ǰ����1������д�������ж� ��λ�ã�xiao<da��,����д
//          for (double xiao =Math.ceil(min); xiao < da ;xiao++) {
//              double abs=Math.abs(xiao);
//                   if (abs>6||abs<2.1){
//                       count++;
//                   }
//          }
//          System.out.println("ceil����2 �ܹ���"+count);  //ceil����2 �ܹ���9
      }


      }
