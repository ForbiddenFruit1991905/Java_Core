package Homework_3.tasks_from_lection.task_2;

import Homework_3.tasks_from_lection.task_2.model.AnimalClass;
import Homework_3.tasks_from_lection.task_2.model.Animals;
import Homework_3.tasks_from_lection.task_2.service.AnimalsService;

import static Homework_3.tasks_from_lection.task_2.model.AnimalClass.Cat;

public class Main {
    public static void main(String[] args) {
        AnimalsService service = new AnimalsService();

        service.addNewAnimal(AnimalClass.getClass(1), "Kitty", "white", 3);
        service.addNewAnimal(AnimalClass.getClass(2), "Lucky", "brown", 4);
        service.addNewAnimal(AnimalClass.getClass(3), "Fluffy", "blue", 1);

        System.out.println(service.getAnimalsList());
        Animals cat = new Animals(Cat,"Kitty", "white", 3, 1);

        System.out.println(cat.run(Cat,50));
        System.out.println(cat.jump(1));
        System.out.println(cat.swim(15));
    }
}
