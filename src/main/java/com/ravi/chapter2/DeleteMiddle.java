package com.ravi.chapter2;

public class DeleteMiddle {

  public boolean deleteMe(LinkedListNode middleNode) {
    if(middleNode == null || middleNode.next == null)
      return false;
    middleNode.data = middleNode.next.data;
    middleNode.next = middleNode.next.next;
    return true;
  }

}
