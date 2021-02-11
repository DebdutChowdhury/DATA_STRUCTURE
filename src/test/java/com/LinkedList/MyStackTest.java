package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void given3number_whenadded_stackSouldhaveLastAddNode() {
        MyStack mystack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        mystack.push(myFirstNode);
        mystack.push(mySecondNode);
        mystack.push(myThirdNode);
        mystack.printMyStack();
        INode myNode = mystack.peak();
        Assert.assertEquals(myThirdNode, myNode);
    }

    @Test
    public void given3number_whenPoped_souldMatchwithLastAddedNode() {
        MyStack mystack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        mystack.push(myFirstNode);
        mystack.push(mySecondNode);
        mystack.push(myThirdNode);
        mystack.printMyStack();
        INode myNode = mystack.pop();
        Assert.assertEquals(myThirdNode, myNode);
    }
}
