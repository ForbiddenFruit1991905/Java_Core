package Homework_3.tasks_from_lection.task_2.service;

import Homework_3.tasks_from_lection.task_2.model.AnimalClass;
import Homework_3.tasks_from_lection.task_2.model.Animals;
import java.util.ArrayList;

public class AnimalsService {
    private ArrayList animals;
    private AnimalBuilder animalBuilder;

    public AnimalsService() {
        this.animals = new ArrayList<>();
        this.animalBuilder = new AnimalBuilder();
    }

    public Animals addNewAnimal(AnimalClass type, String name, String color, int age) {
        Animals animal = animalBuilder.build(type, name, color, age);
        animals.add(String.valueOf(animal));
        return animal;
    }

    public String getAnimalsList() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список животных:\n");
        for (Object animal : animals) {
            stringBuilder.append(animal);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
