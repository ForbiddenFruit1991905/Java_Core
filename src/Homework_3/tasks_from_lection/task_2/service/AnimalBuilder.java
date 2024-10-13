package Homework_3.tasks_from_lection.task_2.service;

import Homework_3.tasks_from_lection.task_2.model.AnimalClass;
import Homework_3.tasks_from_lection.task_2.model.Animals;

public class AnimalBuilder {
    private int count_id = 1;
    public Animals build(AnimalClass type, String name, String color, int age) {
        return new Animals(type, name, color, age, count_id++) {
            @Override
            public boolean run(int distance) {
                return false;
            }
        };
    }
}
