package com.ravi.chapter2;

public class KthToLast {

  // Two pointers
  // Traverse first to k then traverse second until first hits end.
  //If both meets then there is a cycle.
  public int getKFromLast(LinkedListNode input, int N) {
    LinkedListNode slow = input;
    LinkedListNode fast = input;

    for(int i=0; i<N; i++) {
      if(fast == null) return -1;
      fast = fast.next;
    }

    while(fast != null) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow.data;
  }

}
