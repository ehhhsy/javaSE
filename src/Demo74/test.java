package Demo74;

/**
 * ����ʽ�ӿڵ�ʹ�ã�һ����Ϊ�����Ĳ����ͷ���ֵ����
 */
public class test {
    public static void main(String[] args) {
        //����show����,�����Ĳ�����һ���ӿڣ����Կ��Դ��ݽӿڵ�ʵ���࣡����
        show(new Demo01Impl());

        //����show�����������Ĳ�����һ���ӿ�,�������ǿ��Դ��ݽӿڵ������ڲ���
        show(new Demo01() {
            @Override
            public void say() {
                System.out.println("2222222");
            }
        });
        //����show�����������Ĳ�����һ������ʽ�ӿ�,����ʹ��lambda���ʽ
        show(()-> System.out.println("33333333"));
    }

    private static void show(Demo01 myInterface) {
        myInterface.say();
    }
}
