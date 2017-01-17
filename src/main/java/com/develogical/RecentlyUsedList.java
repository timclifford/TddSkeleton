package com.develogical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ape05 on 17/01/2017.
 */
public class RecentlyUsedList<E> {
    private List<E> list = new ArrayList<>();
    public boolean isEmpty() {
        return true;
    }

    public void add(E value) {
        if(list.contains(value))
            return;
        list.add(0,value);
    }

    public E get(int index) {
        return list.get(index);
    }

    public int count() {
        return list.size();
    }
}
