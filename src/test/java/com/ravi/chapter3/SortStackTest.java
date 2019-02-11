package com.ravi.chapter3;

import java.util.Random;
import java.util.Stack;
import org.junit.Test;

public class SortStackTest {

  SortStack s = new SortStack();

  @Test
  public void testSort() {
    Stack<Integer> input = new Stack<Integer>();
    for(int i=0; i<10; i++) {
      input.push(new Random().nextInt(50));
    }
    printStack(input);
    s.sortStack(input);
    printStack(input);
  }

  private void printStack(Stack<Integer> input) {
    for(int i: input) {
      System.out.print(i+ " ");
    }
    System.out.println();
  }

}
