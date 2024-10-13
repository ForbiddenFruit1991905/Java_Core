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
   /*
    Действия принимают размер препятствия и возвращают булев результат.
    Три ограничения: высота прыжка, расстояние, которое животное может
    пробежать, расстояние, которое животное может проплыть. Следует учесть,
    что коты не любят воду.
    */
   public boolean run(int distance) {
       if (distance <= 0) {
           return false;
       }
       return true;
   }

   public boolean swim(int distance) {
       return false;
   }

   public boolean jump(int height) {
       return false;
   }
}
