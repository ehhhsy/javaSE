package Demo13;
/*
 * 方法的覆盖重写的注意事项：
 * 1.必须保证父子类的方法名称，参数列表相同。
 * @Override:写在方法前面，用来检测是不是有效方法的正确覆盖重写
 * 这个注解就算不写，只要满足要求，也是真确的方法覆盖。
 * 
 * 2.子类方法的返回值必须【小于等于】父类方法的返回值类型
 *  父类是object 子类是String √
 * （java.lang.object）object是所有类的公共最高父类（金字塔的顶端）
 * 
 * 3.子类方法的权限，必【大于等于】父类方法的修饰符。
 * 小拓展：public 》protected》（default）》private
 * （default）不是关键子default，而是什么都不写
 * 如：父类修饰符是protected ，子类是public √
 */
public class Demo01Override {
 
}
                                                                       