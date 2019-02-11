package com.ravi.chapter3;

import java.util.Stack;

public class SortStack {

  public Stack<Integer> sortStack(Stack<Integer> input) {
    Stack<Integer> cache = new Stack<Integer>();
    cache.push(input.pop());
    while(! input.isEmpty()) {
      int current = input.pop();
      int count = 0;
      while(! cache.isEmpty() && current < cache.peek()) {
        count++;
        input.push(cache.pop());
      }
      cache.push(current);
      for(int i=0; i<count; i++) {
        cache.push(input.pop());
      }
    }
    while(! cache.isEmpty()) {
      input.push(cache.pop());
    }
    return input;
  }

}
