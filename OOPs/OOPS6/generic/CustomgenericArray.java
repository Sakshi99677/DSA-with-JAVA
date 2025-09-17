// package com.kunal.generics;

import java.util.Arrays;

public class CustomgenericArray<d> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomgenericArray() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(d num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public d remove() {
        d removed = (d) data[--size];
        return removed;
    }

    public d get(int index) {
        return (d) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{"
                + "data=" + Arrays.toString(data)
                + ", size=" + size
                + '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        // CustomgenericArray list = new CustomgenericArray();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        // for (int i = 0; i < 14; i++) {
        //     list.add(2 * i);
        // }
        // System.out.println(list);
        CustomgenericArray<String> list = new CustomgenericArray<>();
        list.add("Sakshi");
        list.add("Min");
        System.out.println(list);

    }
}
