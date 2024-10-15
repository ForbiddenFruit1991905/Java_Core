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

    private int calculateRange(int value, int age) {
        double range = 0.25 * age; // 25% от возраста
        return (int) (range * value);
    }

    public boolean run(AnimalClass type, int age, int distance) {
        int range = calculateRange(distance, age);

        switch (type) {
            case Cat:
                return distance >= 0 && distance <= 200 + range;
            case Dog:
                return distance >= 0 && distance <= 500 + range;
            case Bird:
                return distance >= 0 && distance <= 1000 + range;
            default:
                return false;
        }
    }

    public boolean swim(AnimalClass type, int age, int distance) {
        int range = calculateRange(distance, age);

        switch (type) {
            case Dog:
                return distance >= 0 && distance <= 10 + range;
            default:
                return false;
        }
    }

    public boolean jump(AnimalClass type, int age, int height) {
        int range = calculateRange(height, age);

        switch (type) {
            case Cat:
                return height >= 0 && height <= 2 + range;
            case Dog:
                return height >= 0 && height <= 4 + range;
            case Bird:
                return height >= 0 && height <= 10 + range;
            default:
                return false;
        }
    }
}
