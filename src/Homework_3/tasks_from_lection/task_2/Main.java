package Homework_3.tasks_from_lection.task_2;

import Homework_3.tasks_from_lection.task_2.model.AnimalClass;
import Homework_3.tasks_from_lection.task_2.model.Animals;
import Homework_3.tasks_from_lection.task_2.service.AnimalsService;

import static Homework_3.tasks_from_lection.task_2.model.AnimalClass.Cat;
import static Homework_3.tasks_from_lection.task_2.model.AnimalClass.Dog;
import static Homework_3.tasks_from_lection.task_2.model.AnimalClass.Bird;

public class Main {
    public static void main(String[] args) {
        AnimalsService service = new AnimalsService();

        service.addNewAnimal(AnimalClass.getClass(1), "Kitty", "white", 3);
        service.addNewAnimal(AnimalClass.getClass(2), "Lucky", "brown", 4);
        service.addNewAnimal(AnimalClass.getClass(3), "Fluffy", "blue", 1);

        System.out.println(service.getAnimalsList());
        System.out.println("__________________________________________________________");
        // Cat
        Animals cat = new Animals(Cat,"Kitty", "white", 3, 1);

        System.out.printf(cat + "\n" + cat.getName() + " может: " + "\n" + "пробежать заданную дистанцию " + cat.run(Cat,250) + "\n"
        + "подпрыгнуть на заданную высоту " + cat.jump(Cat,1) + "\n" + "проплыть " + cat.swim(Cat, 15) + "\n");
        System.out.println("__________________________________________________________");
        // Dog
        Animals dog = new Animals(Dog,"Lucky", "brown", 4, 2);
        System.out.printf(dog.getName() + " может пробежать заданное расстояние " + dog.run(Dog,250) + "\n");
        System.out.println(dog.jump(Dog,1));
        System.out.println(dog.swim(Dog, 15));
        System.out.println("__________________________________________________________");
        // Bird
        Animals bird = new Animals(Bird,"Fluffy", "blue", 4, 3);

        System.out.println(bird.run(Bird,250));
        System.out.println(bird.jump(Bird,1));
        System.out.println(bird.swim(Bird, 15));
    }
}
