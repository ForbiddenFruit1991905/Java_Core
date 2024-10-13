package Homework_3.tasks_from_lection.task_1.model;

public class Cat {
    /*
    1. Написать класс кота (из лекции) так, чтобы каждому объекту кота
    присваивался личный порядковый целочисленный номер.
     */
    String name;
    String color;
    int age;
    int catId;

    public Cat(String name, String color, int age, int catId) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.catId = catId;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getCatId() {
        return catId;
    }

    public String toString() {
        return String.format("ID: %d\nИмя: %s\nЦвет: %s\nВозраст: %d",
                getCatId(), getName(), getColor(), getAge());
    }
}
