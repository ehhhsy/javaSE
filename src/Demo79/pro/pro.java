package Demo79.pro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 来描述一些需要执行的类名和方法名   与pro
 * 需要2个：
 */
@Target(ElementType.TYPE)  //作用在类上
@Retention(RetentionPolicy.RUNTIME)//注解保留在runtime阶段
public @interface pro {

     String className();
     String methodName();
}
