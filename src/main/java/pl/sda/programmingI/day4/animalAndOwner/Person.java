package pl.sda.programmingI.day4.animalAndOwner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private List<Food> foodList = new ArrayList<>();
    private List<Animal> animalList = new ArrayList<>();

    public Person(String name, List<Food> foodList, List<Animal> animalList) {
        this.name = name;
        this.foodList = foodList;
        this.animalList = animalList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feed(){
        for (Animal animal : animalList){
            foodList.stream()
                    .filter(animal::isMyFavFood)
                    .findAny()
                    .ifPresent(animal::feedAnimals);
        }
    }

    public List<Animal> hungryAnimals(){
        return animalList.stream()
                .filter(Animal::isHungry)
                .collect(Collectors.toList());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //    metoda feed
}
