package Homework_3.tasks_from_lection.task_1.model.iterator;

import java.util.Iterator;
import java.util.List;

public class CatIterator implements Iterator {

    private int index;
    private List catList;

    public CatIterator(List catList) {
        this.catList = catList;
    }
    @Override
    public boolean hasNext() {
        return catList.size() > index;
    }

    @Override
    public Object next() {
        return catList.get(index++);
    }
}
