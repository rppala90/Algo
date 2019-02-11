package com.ravi.chapter3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Implement Queue using 2 stacks.
 */
public class MyQueue {

  Stack<Integer> s1 = new Stack<Integer>();
  Stack<Integer> s2 = new Stack<Integer>();

  public void add(int data) {
    s1.push(data);
  }

  public Integer remove() {

    while( ! s1.empty() ) {
      s2.push(s1.pop());
    }
    Integer value = s2.pop();
    if(s2.empty()) {
      return value;
    }
    while( !s2.empty() ) {
      s1.push(s2.pop());
    }
    return value;
  }

  public boolean isEmpty() {
    return s1.empty();
  }

}
