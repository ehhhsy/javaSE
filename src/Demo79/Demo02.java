package Demo79;

/**
 * @Author: hsy
 * @Date: 2022/10/21/20:24
 * @Description:
 * | @Override         | ��ⱻ��ע���־�ķ����Ƿ��Ǽ̳��Ը���ӿ� |
 * | ----------------- | ------------------------------------------ |
 * | @Deprecated       | ����ע���ע�������ѹ�ʱ                   |
 * | @SuppressWarnings | ѹ�ھ���                                   |
 */
@SuppressWarnings("all")
public class Demo02 {
    @Override
    public String toString(){
        return super.toString();
    }
    @Deprecated
    public void show01(){
        //��ȱ��
    }
    public void  show02(){
        //���show01();
    }

    public void demo(){
        show01();
    }
}
