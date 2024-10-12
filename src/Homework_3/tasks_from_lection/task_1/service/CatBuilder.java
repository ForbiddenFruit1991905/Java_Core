package Homework_3.tasks_from_lection.task_1.service;

import Homework_3.tasks_from_lection.task_1.model.Cat;

public class CatBuilder {
    private int count_id = 1;

    public Cat build(String name, String color, int age) {
        return new Cat(name, color, age, count_id++);
    }
}
