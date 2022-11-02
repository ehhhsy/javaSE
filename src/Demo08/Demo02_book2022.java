package Demo08;

public class Demo02_book2022 {
    private int number;
    private String name;

    public Demo02_book2022(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public Demo02_book2022(){};

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
