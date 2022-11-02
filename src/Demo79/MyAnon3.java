package Demo79;

import java.lang.annotation.*;

/**
 * @Author: hsy
 * @Date: 2022/10/21/21:20
 * @Description:
 * + ==@Target==：描述注解能作用的位置
 * + ==@Retention==：描述注解是否被抽取到api文档中
 * + ==@Documents==：描述注解是否被抽取到api文档中
 * + ==@Inherited==：描述注解是否被子类继承
 */
//@Target(value = {ElementType.TYPE})  //表示该MyAnon3 只能作用于类上
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //变量，方法，类上都可以
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnon3 {

}
