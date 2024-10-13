package Homework_3.tasks_from_lection.task_2.model;

public enum AnimalClass {
    Cat,
    Dog,
    Bird;

    public static AnimalClass getClass (int classID){
        switch (classID){
            case 1:
                return AnimalClass.Cat;
            case 2:
                return AnimalClass.Dog;
            case 3:
                return AnimalClass.Bird;
            default:
                return null;
        }
    }
}
