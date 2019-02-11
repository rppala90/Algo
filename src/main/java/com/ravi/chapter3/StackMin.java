package com.ravi.chapter3;

import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Stack;

/*
 * Design Stack with Push, Pop & Min with O(1) time.
 */
public class StackMin extends Stack<Integer> {

  Stack<Integer> minStack = new Stack<Integer>();

  public Integer pop() {
    Integer value = super.pop();
    if(minStack.size()>0 && value == min()) {
      minStack.pop();
    }
    return value;
  }

  public void push(int item) {
    if( item <= min() ) {
        minStack.push(item);
    }
    super.push(item);
  }

  public int min() {
    if(minStack.isEmpty()) {
      return Integer.MAX_VALUE;
    } else {
      return minStack.peek();
    }
  }

}
