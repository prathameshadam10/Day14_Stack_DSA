package com.bridgelabz.stack;

import com.bridgelabz.LinkedList;

public class Stack<T> {
LinkedList<T> linkedList = new LinkedList<>();

    public void add(T data) {
        linkedList.add(data);
    }

    public void show() {
        linkedList.show();
    }
}
