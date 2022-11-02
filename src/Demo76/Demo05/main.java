package Demo76.Demo05;

/**
 * @Author: hsy
 * @Date: 2022/10/19/18:36
 * @Description:
 */
public class main {
    public static void main(String[] args) {
        Person person_1 = method("小白", (str) -> {
            Person person = new Person(str);
            return person;
        });
        System.out.println(person_1.getName());

        /**
         * @description 使用方法的引用优化lambda表达式
         * 构造方法new Person(String name)已知
         * 创建对象已知，new
         * 就可以使用Person引用new创建对象
         */
        Person person_2 = method("小黑", Person::new);
        System.out.println(person_2);
    }
    //定义一个方法，参数使用函数式接口，为调用方法使用lambda表达式
    protected static Person method(String str,PersonBuilder personBuilder){
        Person person = personBuilder.builderPerson(str);
        return person;
    }
}
