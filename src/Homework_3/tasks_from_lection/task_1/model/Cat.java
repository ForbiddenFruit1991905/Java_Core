package Homework_3.tasks_from_lection.task_1.model;

import java.util.List;

public class Cat {
    /*
    1. Написать класс кота (из лекции) так, чтобы каждому объекту кота
    присваивался личный порядковый целочисленный номер.
    2. Написать классы кота, собаки, птицы, наследники животного. У всех есть
    три действия: бежать, плыть, прыгать. Действия принимают размер
    препятствия и возвращают булев результат. Три ограничения: высота
    прыжка, расстояние, которое животное может пробежать, расстояние,
    которое животное может проплыть. Следует учесть, что коты не любят воду.
    3*. Добавить механизм, создающий 25% разброс значений каждого
    ограничения для каждого объекта животного
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
