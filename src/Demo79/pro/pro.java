package Demo79.pro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ������һЩ��Ҫִ�е������ͷ�����   ��pro
 * ��Ҫ2����
 */
@Target(ElementType.TYPE)  //����������
@Retention(RetentionPolicy.RUNTIME)//ע�Ᵽ����runtime�׶�
public @interface pro {

     String className();
     String methodName();
}
