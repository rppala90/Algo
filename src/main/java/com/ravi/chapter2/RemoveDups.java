package com.ravi.chapter2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDups {

  public LinkedListNode removeDuplicates(LinkedListNode head) {
    if(head==null) return head;
    Set<Integer> cache = new HashSet<Integer>();
    LinkedListNode temp = head;
    LinkedListNode previous = head;
    cache.add(temp.data);
    while((temp = temp.next)!=null) {
      if(cache.contains(temp.data)) {
        previous.next = temp.next;
      } else {
        cache.add(temp.data);
        previous = temp;
      }
    }
    return head;
  }
}
