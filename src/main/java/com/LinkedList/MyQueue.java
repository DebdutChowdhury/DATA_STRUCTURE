package com.LinkedList;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(MyNode myNode) {
        myLinkedList.append(myNode);
    }

    public void printMyQueue() {
        myLinkedList.printMyNode();
    }

    public boolean empty(){
        return myLinkedList.head == null;
    }

    public INode peak() {
        if(!empty()){
            return myLinkedList.head;
        }
        else {
            System.out.println("Empty Queue");
        }
        return null;
    }

    public INode dequeue() {
        return myLinkedList.pop();
    }
}
