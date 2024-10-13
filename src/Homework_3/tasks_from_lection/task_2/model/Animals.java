package Homework_3.tasks_from_lection.task_2.model;

public class Animals {
    /*
    2. Написать классы кота, собаки, птицы, наследники животного. У всех есть
    три действия: бежать, плыть, прыгать. Действия принимают размер
    препятствия и возвращают булев результат. Три ограничения: высота
    прыжка, расстояние, которое животное может пробежать, расстояние,
    которое животное может проплыть. Следует учесть, что коты не любят воду.
    3*. Добавить механизм, создающий 25% разброс значений каждого
    ограничения для каждого объекта животного.
     */
    private final AnimalClass type;
    String name;
    String color;
    int age;
    int ID;
    private AnimalClass Cat;

    public Animals(AnimalClass type, String name, String color, int age, int ID) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
        this.ID = ID;
    }

    public AnimalClass getType() {
        return type;
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

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", ID=" + ID;
    }

    public boolean run(AnimalClass type, int distance) {

        switch (type) {
            case Cat:
                return distance >= 0 && distance <= 200;
            case Dog:
                return distance >= 0 && distance <= 500;
            case Bird:
                return distance >= 0 && distance <= 1000;
            default:
                return false;
        }
    }

    public boolean swim(AnimalClass type, int distance) {
        switch (type) {
            case Cat:
                return false; // Кошки обычно не плавают
            case Dog:
                return distance >= 0 && distance <= 10;
            case Bird:
                return false; // не все птицы умеют плавать...
            default:
                return false;
        }
    }

    public boolean jump(AnimalClass type, int height) {
        switch (type) {
            case Cat:
                return height >= 0 && height <= 2;
            case Dog:
                return height >= 0 && height <= 4;
            case Bird:
                return height >= 0 && height <= 10;
            default:
                return false; // По умолчанию возвращаем false, если тип животного не распознан
        }
    }
}
