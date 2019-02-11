package com.ravi.chapter3;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class MyQueueTest {

  MyQueue mq = new MyQueue();

  @Test
  public void myQueueTest() {
    Queue<Integer> q = new LinkedList<Integer>();
    for(int i=0; i<10; i++) {
      q.add(i);
      mq.add(i);
    }
    for(int i=0; i<10; i++) {
      assertEquals(q.remove(), mq.remove());
    }

    assertEquals(q.isEmpty(), true);
    assertEquals(mq.isEmpty(), true);
  }

}
