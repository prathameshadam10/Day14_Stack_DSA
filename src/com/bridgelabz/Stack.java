package com.bridgelabz.stack;

import com.bridgelabz.LinkedList;
import com.bridgelabz.Node;

public class Stack<T> {


LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.add(data);
    }

    public void show() {
        linkedList.show();
    }




}
