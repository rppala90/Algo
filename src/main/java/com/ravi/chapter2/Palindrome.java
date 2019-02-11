package com.ravi.chapter2;

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {

  public boolean checkPalindrome(LinkedListNode head) {
    Stack<Integer> content = new Stack<Integer>();
    LinkedListNode current = head;
    int size = LinkedListNode.size(head);
    for(int i=0; i<Math.floor(size/2); i++){
      content.push(current.data);
      current = current.next;
    }
    if(size%2!=0) current = current.next;
    while(!content.isEmpty()) {
      if(current.data != content.pop()) {
        return false;
      }
      current = current.next;
    }
    return true;
  }

}
