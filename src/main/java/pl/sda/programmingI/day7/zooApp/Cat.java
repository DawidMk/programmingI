package pl.sda.programmingI.day7.zooApp;

public class Cat extends Animal {
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Cat: name: " + getName() + ", age: " + getAge();
    }
    }

