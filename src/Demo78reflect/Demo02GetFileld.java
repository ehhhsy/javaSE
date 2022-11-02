package Demo78reflect;

import java.lang.reflect.Field;

/**
 * @Author: hsy
 * @Date: 2022/10/20/19:48
 * @Description: 获取field成员变量
 */
public class Demo02GetFileld {
    /*

     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.需要一个class对象
        Class<Person> class_1 = Person.class;

        /*获取成员变量
        2. Field[] getFields()
             Field getField(String name)
             Field[] getDeclaredFields()
             Field getDeclaredField (String name)
         */
        Field[] fieldsArr = class_1.getFields();
        for (Field field : fieldsArr) {
            System.out.println(field);  //public java.lang.String Demo78reflect.Person.address
        }
        System.out.println("===========");
        Field field_1 = class_1.getField("address");//public java.lang.String Demo78reflect.Person.address
        System.out.println(field_1);
//        Field field1_2 = class_1.getField("b"); //NoSuchFieldException: b   没有找到被public修饰的名字叫b的
//        System.out.println(field1_2);
        System.out.println("================================================");
        Field[] fieldsArr2 = class_1.getDeclaredFields();
        for (Field field : fieldsArr2) {
            System.out.println(field);
        }
        Field field_4 = class_1.getDeclaredField("c");
        System.out.println(field_4);
        System.out.println("================================================");
        Field field_5 = class_1.getDeclaredField("name");
        Person person = new Person();
        //忽略安全检查
        field_5.setAccessible(true); //暴力反射
        field_5.set(person,"hsy");
        System.out.println(field_5.get(person));

    }
    }
