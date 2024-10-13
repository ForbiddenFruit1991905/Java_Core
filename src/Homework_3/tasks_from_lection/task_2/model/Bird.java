package Homework_3.tasks_from_lection.task_2.model;

public class Bird extends Animals {
    public Bird(AnimalClass type, String name, String color, int age, int ID) {
        super(type, name, color, age, ID);
    }
//    @Override
    public boolean run(int distance) {
        return distance <= 100;
    }

//    @Override
    public boolean swim(int distance) {
        return false;
    }

//    @Override
    public boolean jump(int height) {
        return height <= 5;
    }
}
