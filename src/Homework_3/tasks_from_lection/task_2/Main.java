package Homework_3.tasks_from_lection.task_2;


import Homework_3.tasks_from_lection.task_1.model.Cat;
import Homework_3.tasks_from_lection.task_2.model.AnimalClass;
import Homework_3.tasks_from_lection.task_2.model.Animals;
import Homework_3.tasks_from_lection.task_2.service.AnimalsService;

public class Main {
    public static void main(String[] args) {
        AnimalsService service = new AnimalsService();

        service.addNewAnimal(AnimalClass.Cat, "Kitty", "white", 3);
        service.addNewAnimal(AnimalClass.Dog, "Lucky", "brown", 4);
        service.addNewAnimal(AnimalClass.Bird, "Fluffy", "blue", 1);

        System.out.println(service.getAnimalsList());

        Animals animal = new Animals(AnimalClass.Cat, "Kitty", "white", 3, 1);
        System.out.println(animal.run(250));
//        System.out.println(animal.jump(30));
//        System.out.println(animal.swim(15));
    }
}
