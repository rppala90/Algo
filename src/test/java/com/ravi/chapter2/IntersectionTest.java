package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntersectionTest {

  Intersection i = new Intersection();

  @Test
  public void intersectNodeTest() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    for (int i = 1; i < 5; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input = input.next;
    }

    input = new LinkedListNode(0);
    LinkedListNode head1 = input;
    for(int i=1; i<3; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input = input.next;
    }
    input.next = head;

    assertEquals(head, i.intersectionNode(head, head1));

  }

}
