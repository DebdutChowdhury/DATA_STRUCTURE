package com.LinkedList;

public class MyLinkedList {
    public INode head;
    public INode tail;


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNode() {
        StringBuffer myNodes = new StringBuffer("My Node: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append(" --> ");
            tempNode = tempNode.getNext();
            myNodes.append(tempNode.getKey());
            System.out.println(myNodes);
        }
    }

    public void append(INode newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempnode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempnode);
    }

    public INode pop() {
        INode temonode = head;
        this.head = head.getNext();
        return temonode;
    }
}
