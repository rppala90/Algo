package com.ravi.chapter4;

import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryMinHeapTest {

  private int[] input;
  private BinaryMinHeap bmh;

  @Before
  public void setUp() {
    Random r = new Random();
    input = new int[10];
    for(int i=0; i<10; i++) {
      input[i] = r.nextInt(50);
    }
    bmh = new BinaryMinHeap(input);
  }

  @Test
  public void testbinaryHeap() {

    System.out.println("Original Array :");
    for (int i : input) {
      System.out.print(i + " ");
    }
    System.out.println();
    bmh.buildHeap();
    System.out.println("After Build Heap :");
    for (int i : input) {
      System.out.print(i + " ");
    }
    System.out.println();
    int min = bmh.removeMin();
    Assert.assertEquals(bmh.getMin() >= min, true);
    System.out.println("After RemoveMin :");
    boolean gotMaxVal = false;
    for (int i : input) {
      System.out.print(i + " ");
    }
    System.out.println();
    bmh.heapSort();
    System.out.println("After heapSort :");
    for(int i: input) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

}