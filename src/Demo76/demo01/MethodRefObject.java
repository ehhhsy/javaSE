package Demo76.demo01;

import java.util.Locale;

/**
 * @Author: hsy
 * @Date: 2022/10/19/16:02
 * @Description:对象的引用,对象名引用成员方法
    使用前提：对象名已经存在，成员方法也已经是存在的
    就可以使用对象名来引用成员方法
 */
public class MethodRefObject {


    //定义一个成员方法，传递字符串，把字符串按照大写输出
    public  void printUpString(String str){
        System.out.println(str.toUpperCase(Locale.ROOT));
        }
    }
