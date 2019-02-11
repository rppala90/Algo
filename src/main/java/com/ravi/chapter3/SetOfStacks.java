package com.ravi.chapter3;

import java.util.ArrayList;
import java.util.Stack;

/*
 *  Push, pop.
 */
public class SetOfStacks {

  ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
  final int THRESHOLD = 12;

  public void push(int data) {
    Stack lastStack = getLastStack();
    if(lastStack.size() == THRESHOLD) {
      lastStack = new Stack<Integer>();
      stacks.add(lastStack);
    }
    lastStack.push(data);
  }

  public Integer pop() {
    Stack<Integer> lastStack = getLastStack();
    if(lastStack.size() == 1) {
      stacks.remove(lastStack);
    }
    return lastStack.pop();
  }

  private Stack getLastStack() {
    Stack lastStack = null;
    if(stacks.isEmpty()) {
      lastStack = new Stack<Integer>();
      stacks.add(lastStack);
    } else {
      lastStack = stacks.get(stacks.size()-1);
    }
    return lastStack;
  }

}
