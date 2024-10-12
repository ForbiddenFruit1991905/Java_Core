package Homework_3.tasks_from_lection.task_1.service;

import Homework_3.tasks_from_lection.task_1.model.Cat;
import Homework_3.tasks_from_lection.task_1.model.iterator.CatIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class CatService implements Iterable{
    private ArrayList cats;
    private CatBuilder catBuilder;

    public CatService() {
        this.cats = new ArrayList();
        this.catBuilder = new CatBuilder();
    }

    public Cat addCat(String name, String color, int age) {
        Cat cat = catBuilder.build(name, color, age);
        cats.add(String.valueOf(cat));
        return cat;
    }

    @Override
    public Iterator iterator() {
        return new CatIterator(cats);
    }

    public String getCatList() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список кошечек и котов:\n");
        for (Object cat : cats) {
            stringBuilder.append(cat);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
