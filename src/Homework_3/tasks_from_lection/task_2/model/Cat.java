package Homework_3.tasks_from_lection.task_2.model;

public class Cat extends Animals {
    public Cat(AnimalClass type, String name, String color, int age, int ID) {
        super(type, name, color, age, ID);
    }
//    @Override
    public boolean run(int distance) {
        // логика для кошек: реализация бега
        if (distance <= 200) {
            return true;
        }
        return false;
    }

//    @Override
    public boolean swim(int distance) {
        return false; // кошки не плавают
    }

//    @Override
    public boolean jump(int height) {
        return height <= 2; // ограничение для высоты прыжка
    }
}
