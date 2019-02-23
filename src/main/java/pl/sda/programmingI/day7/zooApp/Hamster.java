package pl.sda.programmingI.day7.zooApp;

public class Hamster extends Animal {
    public Hamster(String name, Integer age) {
        super(name, age);
    }
    @Override
    public String introduceYourself() {
        return "Hamster: name: " + name + ", age: " + age;
    }
}
