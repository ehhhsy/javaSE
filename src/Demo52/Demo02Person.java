package Demo52;

public class Demo02Person implements Comparable<Demo02Person>{
    private String name;
    private int age;

    public Demo02Person() {
    }

    public Demo02Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo02Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写排序的规则
    @Override
    public int compareTo(Demo02Person o) {
//        return 0;//默认认为元素都是相同的
//     自定义比较的规则，比较两个人的年龄
    return this.getAge()-o.getAge();//升序排序
//    return o.getAge()-this.getAge();//降序排序
    }
}
