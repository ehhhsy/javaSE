package Demo24.NoName_object_test_2022;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public void say_something(String food) {
        System.out.println("look," + this.name + "eating " + food);
    }

    public void pick_age(int age) {
        if (this.age >= age) {
            System.out.println("hi,litter brother,my name si "+this.name);
        } else {
            System.out.println("hi elder brother"+this.name);
        }
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
}