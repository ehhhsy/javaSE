package Demo76.Demo02;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:34
 * @Description ͨ���������þ�̬��Ա����
 *              ����ڣ���̬��Ա����Ҳ�Ѿ�����
 *              �Ϳ���ͨ������ֱ�����þ�̬��Ա����
 */
public class StaticMethodRefObject {
    public static void main(String[] args) {
        //����method�����������������ֵ��������lambda���ʽ
        double d = method(-3.21, (num) -> {
            return Math.abs(num);
        });
        System.out.println(d);

        /**
         ʹ�÷��������Ż�
         Math���Ǵ��ڵ�
         abs����ֵ�ľ�̬����Ҳ���Ѿ����ڵ�
         �������ǿ���ֱ��ͨ������::��̬����   ������
         */
        System.out.println(method(-2.6,Math::abs));

    }
    ////����һ��������������������Ҫ��������֣��ͺ���ʽ�ӿ�calcable
    public static double method(double num,Calcable calcable){
        return   calcable.abs(num);
    }
}
