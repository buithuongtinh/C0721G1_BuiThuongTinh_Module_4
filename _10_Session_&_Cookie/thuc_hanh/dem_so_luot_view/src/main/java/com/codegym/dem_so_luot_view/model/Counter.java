package com.codegym.dem_so_luot_view.model;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Counter() {
    }
    public int increment() {
        return count++;
    }
}
