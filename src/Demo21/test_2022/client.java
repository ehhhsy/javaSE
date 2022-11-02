package Demo21.test_2022;

public class client {
    public static void main(String[] args) {
        person hsy = new hsy();
        hsy.walk();
        hsy.say();
        hsy.eat();

        System.out.println("====bounds===========");
        dog dog = new dog("litter_black",20);
        dog.eat();
        dog.DogToRun();
        dog.intrude();
        dog.setName("litter_cheng");
        dog.say();
        dog.eat();

    }
}
