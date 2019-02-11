package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDupsTest {

  RemoveDups rd = new RemoveDups();

  @Test
  public void removeDupsTest() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    for(int i=1; i<10; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input=input.next;
    }
    //Add Duplicate
    LinkedListNode temp = new LinkedListNode(8);
    input.next = temp;
    input = input.next;

    assertEquals(11, LinkedListNode.size(head));
    LinkedListNode.printList(head);
    rd.removeDuplicates(head);
    LinkedListNode.printList(head);
    assertEquals(10, LinkedListNode.size(head));
  }

}
