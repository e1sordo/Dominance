package com.vlavik.dominance.model.enums;

public enum CellType {
    SMALL(8),
    BIG(12);

    private int capacity;

    CellType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
