package com.ravi.chapter2;

public class LoopDetect {

  public boolean loopExists(LinkedListNode head) {
    LinkedListNode slower = head;
    LinkedListNode faster = head.next;
    while(faster != slower && faster != null) {
      if(faster.next==null) return false;
      faster = faster.next.next;
      slower = slower.next;
      if(faster == slower) return true;
    }
    return false;
  }

}
