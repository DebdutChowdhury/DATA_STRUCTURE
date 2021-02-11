package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void givrn3number_addedToQueue_Shouldgetresult() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printMyQueue();
        INode myNode = myQueue.peak();
        Assert.assertEquals(myFirstNode, myNode);
    }
}
