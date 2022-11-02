package Demo51;

import java.util.HashSet;

/*
hashSet存储自定义类型元素

set集合报错元素唯一：                                    （写在Students类中）
        存储的元素（String,Integer,Studends,person）,必须重写hasCode和equals方法

        要求：
        同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo04 {
    public static void main(String[] args) {
        //没有重写hasCode和equals方法==================================
//        HashSet<Students> set = new HashSet<>();
//        Students studentsone = new Students("王一", 12);
//        Students studentstwo = new Students("王一", 12);
//        Students studentsthree = new Students("李四", 19);
//        System.out.println(studentsone.hashCode());//189568618 两个hasCode值不一样 ××××××××××××××××××××××××××××××
//        System.out.println(studentstwo.hashCode());//793589513 通过检测1
//        System.out.println(studentsone.equals(studentstwo));//false  因为是两个new的，所以不一样，通过检测2
//        set.add(studentsone);
//        set.add(studentstwo);
//        set.add(studentsthree);
//        System.out.println(set);//name='王一', age=12}, Students{name='王一', age=12}, Students{name='李四', age=19}
//=====================================================================================================================
                HashSet<Students> set = new HashSet<>();
        Students studentsone = new Students("王一", 12);
        Students studentstwo = new Students("王一", 12);
        Students studentsthree = new Students("李四", 19);
        System.out.println(studentsone.hashCode());//29045400  加了必须重写hasCode和equals方法   hsy：要加啊
        System.out.println(studentstwo.hashCode());//29045400  hashCode都变一样了
        System.out.println(studentsone.equals(studentstwo));//true
        set.add(studentsone);
        set.add(studentstwo);
        set.add(studentsthree);
        System.out.println(set);//[Students{name='王一', age=12}, Students{name='李四', age=19}]   √√√√√√√√√√√√√√√√√√√√√√
    }
}
