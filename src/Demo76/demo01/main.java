package Demo76.demo01;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:10
 * @Description:ͨ�����������ó�Ա����
    ʹ��ǰ�᣺�������Ѿ����ڣ���Ա����Ҳ�Ѿ��Ǵ��ڵ�
    �Ϳ���ʹ�ö����������ó�Ա����
 */
public class main {
    public static void main(String[] args) {
        //����printString�����������Ĳ���Printable��һ������ʽ�ӿڣ����Կ��Դ���lambda���ʽ
        printString(s->{
            //����MethodRefObject����
            MethodRefObject methodRefObject_1 = new MethodRefObject();
            //����MethodRefObject����ĳ�Ա����printUpString�����ַ�����д���
            methodRefObject_1.printUpString(s);
        });
        /**
         * ʹ�÷��������Ż�lambda
         * �����Ѿ�������MethodRefObject
         * ��Ա����printUpStringҲ���Ѿ�������
         * �������ǿ���ʹ�ö�����::���ó�Ա����
         */
        //����MethodRefObject����
        MethodRefObject methodRefObject_1 = new MethodRefObject();
        printString(methodRefObject_1::printUpString);
    }
    //����һ��������������������һ��Printable�ӿڣ�
    public static void printString(Printable p){
        p.print("hello");
    }
}
