package com.ravi.chapter2;

import static com.ravi.chapter2.LinkedListNode.listToString;
import static org.junit.Assert.assertEquals;

import java.util.Random;
import org.junit.Test;

public class PartitionTest {

  Partition p = new Partition();

  @Test
  public void paritionTest() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    for(int i=1; i<10; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input=input.next;
    }
    String b4Partition = listToString(head);
    assertEquals(b4Partition, listToString(p.partitionList(head, 3)));

    Random r = new Random();
    LinkedListNode current = new LinkedListNode();
    head = current;
    for(int i=0; i<10; i++) {
      current.data = r.nextInt(10);
      LinkedListNode temp = new LinkedListNode();
      current.next = temp;
      current = current.next;
    }

    System.out.println(listToString(head));
    System.out.println(listToString(p.partitionList(head, 3)));
  }

}
