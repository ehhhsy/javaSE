package Demo79;

/**
 * @Author: hsy
 * @Date: 2022/10/21/20:32
 * @Description:
 */
public @interface MyAnno {
    String show1() default "zhangan"; //String
    int get();      //������������
    String [] show3() default {"a","b","C"};
    int [] show03();
}
