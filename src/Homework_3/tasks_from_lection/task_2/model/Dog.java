package Homework_3.tasks_from_lection.task_2.model;

public class Dog extends Animals {
    public Dog(AnimalClass type, String name, String color, int age, int ID) {
        super(type, name, color, age, ID);
    }

//    @Override
    public boolean run(int distance) {
        return distance <= 500;
    }

//    @Override
    public boolean swim(int distance) {
        return distance <= 10;
    }

//    @Override
    public boolean jump(int height) {
        return height <= 0.5;
    }
}
