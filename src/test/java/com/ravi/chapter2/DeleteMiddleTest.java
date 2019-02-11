package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeleteMiddleTest {

  DeleteMiddle dm = new DeleteMiddle();

  @Test
  public void deleteMiddleTest() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    LinkedListNode deleteNode = null;
    for(int i=1; i<10; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input=input.next;
      if(i==8) deleteNode = temp;
    }

    assertEquals(10, LinkedListNode.size(head));
    assertEquals(dm.deleteMe(deleteNode), true);
    assertEquals(9, LinkedListNode.size(head));

  }

}
