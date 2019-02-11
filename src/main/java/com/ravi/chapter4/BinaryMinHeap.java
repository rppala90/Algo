package com.ravi.chapter4;


import static java.util.Arrays.copyOf;

import java.util.Arrays;

/*
 *  Min(Max) heap is a complete binary tree where each node is smaller(larger) than its children.
 *
 *  Binary Heap represented by array.
 *
 *  Parent      -->   (i -1) / 2
 *  Left Child  -->   ( 2 * i + 1 )
 *  Right Child -->   ( 2 * i + 2 )
 *
 *                  0
 *           1          2
 *       3      4   5       6
 *
 *       LeftChild      RightChild            Parent
 *       2*0 +1 = 1     2*0 +2  = 2     (1-1)/2  and  (2-1)/2
 *       2*1 +1 = 3     2*1 +2  = 4     (3-1)/2  and  (4-1)/2
 *
 *       Array:   0 1 2 3 4 5 ...
 */
public class BinaryMinHeap {

  int[] input;
  int size;

  public BinaryMinHeap(int[] input) {
    this.input = input;
    size = input.length;
  }

    public void buildHeap() {
      for(int i=size/2; i>=0; i--) {
        trickleDown(i);
      }
    }

    private void trickleDown(int i) {
      int parent = i;
      int child1 = (2 * parent) + 1;
      if(child1 >= size) return;
      int child2 = (2 * parent) + 2;
      if(child2 >=size ) child2 = child1;
      int child = child1;
      if(input[child2] < input[child1]) {
        child = child2;
      }
      if(input[parent] > input[child]) {
        int temp = input[parent];
        input[parent] = input[child];
        input[child] = temp;
        trickleDown(child);
      }
    }

    public int removeMin() {
      int retVal = input[0];
      input[0] = input[size-1];
      input[size-1] = Integer.MAX_VALUE;
      trickleDown(0);
      return retVal;
    }

    public int getMin() {
      return input[0];
    }

    public void heapSort() {
      int[] output = Arrays.copyOf(input, size);
      for(int i=0; i<size; i++) {
        output[i] = removeMin();
      }
      for(int i=0; i<output.length; i++) {
        input[i] = output[i];
      }
    }

}
