package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

    @Test
    public void given3number_WhenListShouldPassedTest () {
        MyNode<Integer> myfstNode = new MyNode<>(56);
        MyNode<Integer> mysndNode = new MyNode<>(30);
        MyNode<Integer> mythrdNode = new MyNode<>(70);

        myfstNode.setNext(mysndNode);
        mysndNode.setNext(mythrdNode);

        boolean result = myfstNode.getNext().equals(mysndNode) && mysndNode.getNext().equals(mythrdNode);
        Assert.assertTrue(result);
    }
}
