package Demo79;

import java.lang.annotation.*;

/**
 * @Author: hsy
 * @Date: 2022/10/21/21:20
 * @Description:
 * + ==@Target==������ע�������õ�λ��
 * + ==@Retention==������ע���Ƿ񱻳�ȡ��api�ĵ���
 * + ==@Documents==������ע���Ƿ񱻳�ȡ��api�ĵ���
 * + ==@Inherited==������ע���Ƿ�����̳�
 */
//@Target(value = {ElementType.TYPE})  //��ʾ��MyAnon3 ֻ������������
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //���������������϶�����
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnon3 {

}
