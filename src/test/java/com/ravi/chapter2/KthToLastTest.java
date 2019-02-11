package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthToLastTest {

  KthToLast kl = new KthToLast();

  @Test
  public void NfromLast() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    for (int i = 1; i < 10; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input = input.next;
    }
    assertEquals(9, kl.getKFromLast(head, 1));
    assertEquals(2, kl.getKFromLast(head, 8));
    assertEquals(0, kl.getKFromLast(head, 10));
    assertEquals(-1, kl.getKFromLast(head, 100));
  }

}
