package com.csd.training.exercise.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thinkpad on 18-06-04.
 */
public class Stock {

    private static List<Notebook> notebooks = new ArrayList<Notebook>();

    public int getCount() {
        return notebooks.size();
    }

    public void pushInto(ArrayList<Notebook> notebooks) {
        Stock.notebooks.addAll(notebooks);
    }

    public void clearAll() {
        notebooks.clear();
    }

    public void pushIntoOne(Notebook notebook) {
        notebooks.add(notebook);
    }

    public List<Notebook> getAll() {
        return notebooks;
    }
}
