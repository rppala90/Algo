package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumListTest {

  SumList sl = new SumList();

  @Test
  public void sumListTest() {

    //LinkedListNode 1
    LinkedListNode s1 = new LinkedListNode(7);
    s1.next = new LinkedListNode(1);
    s1.next.next = new LinkedListNode(6);

    //LinkedListNode 2
    LinkedListNode s2 = new LinkedListNode(5);
    s2.next = new LinkedListNode(9);
    s2.next.next = new LinkedListNode(2);

    assertEquals("219", LinkedListNode.listToString(sl.sumList(s1, s2)));
  }

}
