package Demo79;

/**
 * @Author: hsy
 * @Date: 2022/10/21/20:32
 * @Description:
 */
public @interface MyAnno {
    String show1() default "zhangan"; //String
    int get();      //基本数据类型
    String [] show3() default {"a","b","C"};
    int [] show03();
}
