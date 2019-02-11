package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoopDetectTest {

  LoopDetect ld = new LoopDetect();

  @Test
  public void testLoopDetect() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    for (int i = 1; i < 5; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input = input.next;
    }
    assertEquals(false, ld.loopExists(head));
    input.next = head;
    assertEquals(true, ld.loopExists(head.next.next.next));
  }

}
