package test;
//StringBuilder
public class test6 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(1);
        stringBuilder.append('A');
        stringBuilder.append("hello");
//        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.replace(0,2,"java"));
        System.out.println(stringBuilder.insert(4,"hard!!"));
        System.out.println(stringBuilder.capacity());
        stringBuilder.ensureCapacity(30);
        System.out.println(stringBuilder.capacity());
    }
}
