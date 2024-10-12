package Homework_3.tasks_from_lection.task_1;

import Homework_3.tasks_from_lection.task_1.service.CatService;

public class Main {
    public static void main(String[] args) {
        CatService catService = new CatService();
        catService.addCat("Kitty", "white", 3);
        catService.addCat("James", "black", 4);
        catService.addCat("Karamelka", "orange", 2);

        System.out.println(catService.getCatList());
    }
}
