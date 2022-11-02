package Demo35;
/*
3.可以用来修饰一个局部变量,方法的参数也是局部变量
 */
public class Students {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name) {
        this.name = name;
    }

    public Students() {
    }
}
