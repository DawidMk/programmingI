package pl.sda.programmingI.day4.animalAndOwner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {
    private String name;
    // opcjonalnie dodać obsługę ownera
    private Person owner;
    private List<Food> favFood = new ArrayList<>();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, List<Food> favFood) {
        this.name = name;
        this.favFood = favFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public List<Food> getFavFood() {
        return favFood;
    }

    public void setFavFood(List<Food> favFood) {
        this.favFood = favFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(owner, animal.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, favFood);
    }

    //metoda eat
    public String eat(List foodList) {
        String hungry = "";
        if (foodList == null) {
            hungry = "głodny, człowiek nie ma jedzenia";
        } else {
            for (Object o : foodList) {
                for (Food food : favFood) {
                    if (o.equals(food)) {
                        hungry = "najedzony";
                        break;
                    } else {
                        hungry = "dalej głodny";
                    }
                }
            }
        }
        return hungry;
    }

    //metoda still hungry
//    public String stillHungry()
}
