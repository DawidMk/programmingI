package pl.sda.programmingI.day7.zooApp;

public class Dog extends Animal {
    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Dog: name: " + name + ", age: " + age;
    }
}
