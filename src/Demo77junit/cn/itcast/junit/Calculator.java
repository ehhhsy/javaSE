package Demo77junit.cn.itcast.junit;

/**
 * @Author: hsy
 * @Date: 2022/10/19/20:57
 * @Description:
 */
public class Calculator {
    public int sum(int a,int b){
        return a+b;
//        return a-b;  //����-��
    }
    public int sub(int a,int b){
//        int i=3/0; ����Ա���
        return a-b;
    }
}
