package pl.sda.programmingI.day7.zooApp;

public abstract class Animal implements Introduction {
    private String name;
    private Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String introduceYourself() {
        return "name: " + name + ", age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
