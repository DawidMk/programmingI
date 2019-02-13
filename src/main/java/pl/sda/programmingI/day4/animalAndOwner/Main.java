package pl.sda.programmingI.day4.animalAndOwner;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static List<Food> allFoodList = new ArrayList<>();
    public static List<Person> personList = new ArrayList<>();
    public static List<Person> personListTest = new ArrayList<>();
    //    public static List<Animal> animalList = new ArrayList<>();
    public static Random random = new Random();

    public static void main(String[] args) {
//        populateFoodList(50);
        allFoodList = populateFoodListStream(50);
//        populatePersonList(10);
        personList = populatePersonListStream(10);

        List<Animal> list = animalListStream();
//        System.out.println("animal list test");

/*
        for (Animal animal : list) {
            System.out.println(animal.getName());
            System.out.println(animal.getOwner());
            for (Food food : animal.getFavFood()) {
                System.out.println(food.getName());
            }
            System.out.println("koniec zwierza");
        }*/

        System.out.println("\nperson list test");
        populatePersonList2(5);
//        List<Person> peopleList = populatePersonList2(5);
        for (Person person : personListTest) {
            System.out.println();
            System.out.println(person.getName());
            System.out.println("animals:");
            for (Animal animal : person.getAnimalList()) {
                System.out.println(animal.getName());
                System.out.println("OWNER");
                System.out.println(animal.getOwner().getName());
            }
            System.out.println("food:");
            for (Food food : person.getFoodList()) {
                System.out.println(food.getName());
            }
        }
/*
        for (Person person : personList) {
            System.out.println(person.getName());
            System.out.println(person.getAnimalList().toString());
            System.out.println(person.getFoodList().toString());
            System.out.println();
        }*/
    }

    // stwórz listę zwierząt
    private static List<Animal> animalList() {
        List<Animal> animals = new ArrayList<>();
        int size = random.nextInt(5);
        for (int i = 0; i < size; i++) {
            List<Food> list = genericPopulateFood(8);
            Animal animal = new Animal("anim " + i, list);
            animals.add(animal);
        }
        return animals;

    }

    // stwórz listę ludzi
    private static void populatePersonList(int size) {
        for (int i = 0; i < size; i++) {
            Person person = new Person("person " + i, populatePersonalFood(), animalList());
            personList.add(person);
        }
    }

    private static void populatePersonList2(int size) {
        for (int i = 0; i < size; i++) {
            Person person = new Person("person " + i, populatePersonalFood(), animalList());
            for (Animal animal : person.getAnimalList()) {
                animal.setOwner(person);
            }
            personListTest.add(person);
        }
    }

    private static List<Person> populatePersonList2Stream(int size){
        List<Person> list = new ArrayList<>();
        return IntStream.range(0,size)
                .mapToObj(i -> new Person("person "+i,populatePersonalFood(),animalList()))
                .map(person -> person.getAnimalList().stream()
                        .forEach(animal -> animal.setOwner(person)))
                .collect(Collectors.toList());
//       list.stream().map(person -> person.getAnimalList().stream().map(animal -> animal.setOwner(person))).collect(Collectors.toList());

    }

    //stwórz listę wszystkich rodzajów jedzenia 'allFoodList'
    private static void populateFoodList(int size) {
        for (int i = 1; i <= size; i++) {
            allFoodList.add(new Food("food " + i));
        }
    }

    //stwórz listę jedzenia, które ma człowiek; niepotrzebna metoda, może być zastąpiona przez genericPopulateFood
    private static List<Food> populatePersonalFood() {
        int foodCount = random.nextInt(5);
        List<Food> foodList = new ArrayList<>();
        for (int i = 0; i < foodCount; i++) {
            foodList.add(allFoodList.get(random.nextInt(allFoodList.size())));
        }
        return foodList;
    }

    //stwórz listę ulubionego jedzenia zwierza; niepotrzebna metoda, może być zastąpiona przez genericPopulateFood
    private static List<Food> populateFavFood() {
        int foodCount = random.nextInt(8);
        List<Food> foodList = new ArrayList<>();
        for (int i = 0; i < foodCount; i++) {
            foodList.add(allFoodList.get(random.nextInt(allFoodList.size())));
        }
        return foodList;
    }

    //ogólna metoda tworząca listę jedzenia
    private static List<Food> genericPopulateFood(int length) {
        int foodCount = random.nextInt(length);
        List<Food> foodList = new ArrayList<>();
        for (int i = 0; i < foodCount; i++) {
            foodList.add(allFoodList.get(random.nextInt(allFoodList.size())));
        }
        return foodList;
    }


    //=================================================streams====================================================================

    //ogólna metoda tworząca listę jedzenia
    private static List<Food> genericPopulateFoodStream(int length) {
        int size = random.nextInt(length);
        return IntStream.range(0, size)
                .map(i -> random.nextInt(allFoodList.size()))
                .mapToObj(allFoodList::get)
                .collect(Collectors.toList());
    }

    //stwórz listę zwierząt
    private static List<Animal> animalListStream() {
        int size = random.nextInt(5);
        return IntStream.range(0, size)
                .mapToObj(i -> new Animal("anim" + i, genericPopulateFoodStream(8)))
                .collect(Collectors.toList());
    }

    //stwórz listę ludzi
    private static List<Person> populatePersonListStream(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> new Person("person " + i, genericPopulateFood(3), animalListStream()))
                .collect(Collectors.toList());
    }

    //stwórz listę wszystkich rodzajów jedzenia 'allFoodList'
    private static List<Food> populateFoodListStream(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> new Food("food " + i))
                .collect(Collectors.toList());
    }
}
