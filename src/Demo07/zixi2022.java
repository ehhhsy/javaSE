package Demo07;

public class zixi2022 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public zixi2022(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("age ²»·ûºÏ¹æ·¶");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
