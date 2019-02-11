package com.ravi.chapter2;

import java.util.Stack;

public class Intersection {

  public LinkedListNode  intersectionNode(LinkedListNode s1, LinkedListNode s2) {
    Stack<LinkedListNode> s1Stack = new Stack();
    while(s1!=null) {
      s1Stack.push(s1);
      s1 = s1.next;
    }
    Stack<LinkedListNode> s2Stack = new Stack();
    while(s2!=null) {
      s2Stack.push(s2);
      s2 = s2.next;
    }
    LinkedListNode result = null;
    while(! s1Stack.isEmpty() && ! s2Stack.isEmpty() && s1Stack.peek() == s2Stack.pop()) {
      result = s1Stack.pop();
    }
    return result;
  }

}
