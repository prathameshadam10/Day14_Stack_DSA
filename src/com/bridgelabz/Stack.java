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


    public T pop() {
        return linkedList.pop();
    }
    public void peek(){
        Integer peeked = (Integer) linkedList.pop();
        System.out.println("The Peek element is " + peeked);
        linkedList.push((T) peeked);
    }
}
