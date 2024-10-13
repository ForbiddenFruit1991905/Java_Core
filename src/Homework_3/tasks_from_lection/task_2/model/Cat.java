package Homework_3.tasks_from_lection.task_2.model;

public class Cat extends Animals {
    public Cat(AnimalClass type, String name, String color, int age, int ID) {
        super(type, name, color, age, ID);
    }

    public boolean run(int distance) {
//        // логика для кошек: реализация бега
//        final int minRunDistance = 0;
//        final int maxRunDistance = 200;
////        if (distance >= minRunDistance && distance <= maxRunDistance){
////            return true;
////        }
//        return distance <= minRunDistance && distance >= maxRunDistance;
////        return false;
        return false;
    }

    @Override
    public boolean swim(int distance) {
        return false; // кошки не плавают
    }

    @Override
    public boolean jump(int height) {
        final int maxJumpHeight = 2;
        return height <= maxJumpHeight;
    }
}
