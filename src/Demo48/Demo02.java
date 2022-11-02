package Demo48;

public class Demo02 {
    public static void main(String[] args) {
        //不写泛型默认，object类型
        Generic generic = new Generic();
        generic.setName("hxd");
        Object name1 = generic.getName();

        //创建generic对象，泛型用integer
        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.setName(111);
        int name2 = integerGeneric.getName();//自动拆箱
        System.out.println(name2);

        //创建generic对象，泛型用String
        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.setName("撒打算大大");
        String name3 = stringGeneric.getName();
        System.out.println(name3);
    }
}
