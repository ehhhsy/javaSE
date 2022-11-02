package Demo79.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 你想验证，这个方法有没有异常，就给这个方法加上check注解
 */
@Target(ElementType.METHOD)      //能作用到类上
@Retention(RetentionPolicy.RUNTIME)//代码保留到运行时阶段
public @interface Check {
}
