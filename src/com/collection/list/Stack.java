package com.collection.list;

import java.util.LinkedList;

public class Stack {
    private  LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public  void pushStack(Stack stack, Object o) {
        linkedList = stack.linkedList;
        linkedList.addFirst(o);
    }
//弹栈操作，remove之前会返回值
    public  Object pop(Stack stack) {
        linkedList = stack.linkedList;
        return linkedList.removeFirst();
    }

    public  boolean isEmpty(Stack stack) {
        linkedList = stack.linkedList;
        return linkedList.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pushStack(stack, "a");
        stack.pushStack(stack, "b");
        while (!stack.isEmpty(stack)) {
            System.out.print(stack.pop(stack));
        }
    }
}
