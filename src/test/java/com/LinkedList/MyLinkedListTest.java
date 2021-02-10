package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3NumbersAddedTOtheTop() {
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> myfstNode = new MyNode<>(70);
        MyNode<Integer> mythrdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfstNode);
        myLinkedList.add(mysndNode);
        myLinkedList.add(mythrdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(mythrdNode) && myLinkedList.head.getNext().equals(mysndNode) && myLinkedList.tail.equals(myfstNode);
        Assert.assertTrue(result);
    }
}
