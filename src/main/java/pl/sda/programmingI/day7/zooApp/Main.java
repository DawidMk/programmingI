package pl.sda.programmingI.day7.zooApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Animal> animalList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMenu();
    }

    private static void welcomeMenu() {
        System.out.println("welcome to the jungle! we've got fun and games");
        System.out.println("1. show animals");
        System.out.println("2. add animals");
        System.out.println("3. remove animal by name");
        int choice = scanner.nextInt();
        if (choice == 1) {
            showAnimals();
            welcomeMenu();
        } else if (choice == 2) {
            populateAnimalList();
            welcomeMenu();
        } else if (choice == 3) {
            removeAnimals();
            welcomeMenu();
        } else {
            System.out.println("wrong choice");
        }
    }

    private static void showAnimals() {
        if (animalList.isEmpty()) {
            System.out.println("list is still empty! add something first");
        } else {
            for (Animal animal : animalList) {
                System.out.println(animal.introduceYourself());
            }
        }
    }

    private static void populateAnimalList() {
        Animal animal = null;
        System.out.println("which species?\n1. hamster\n2. dog\n3. cat");
        int choice = scanner.nextInt();
        if (choice == 1) {
            createAnimal(choice);
        } else if (choice == 2) {
            createAnimal(choice);
        } else if (choice == 3) {
            createAnimal(choice);
        } else {
            System.out.println("wrong choice");
        }


    }

    private static void createAnimal(int input) {
        Animal animal;
        System.out.println("give name: ");
        String name = scanner.next();
        System.out.println("give age: ");
        Integer age = scanner.nextInt();
        if (input == 1) {
            animal = new Hamster(name, age);
            animalList.add(animal);

        } else if (input == 2) {
            animal = new Dog(name, age);
            animalList.add(animal);

        } else if (input == 3) {
            animal = new Cat(name, age);
            animalList.add(animal);
        }
    }

    private static void removeAnimals() {
        System.out.println("which should be removed?: ");
        String name = scanner.next();
        animalList.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
    }
}


