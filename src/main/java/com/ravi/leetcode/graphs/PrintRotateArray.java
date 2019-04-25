package com.ravi.leetcode.graphs;

public class PrintRotateArray {

  /*
   *
   */
  private static void printSpiral(int[][] input, int layer) {
    //print toprow
    for(int column=layer; column<=input.length-1-layer;column++) {
      System.out.print(" " + input[layer][column] + " ");
    }
    System.out.println();
    //print right column
    for(int row=layer+1; row <= input.length-1-layer; row++) {
      System.out.print(" " + input[row][input.length-1-layer]);
    }
    System.out.println();
    // print bottomrow
    for(int column=input.length-layer-1-1; column>=layer; column--) {
      System.out.print(" " + input[input.length-1-layer][column]);
    }
    System.out.println();
    // print left column
    for(int row=input.length-1-1-layer; row > layer; row--) {
      System.out.print(" " + input[row][layer]);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    for(int i=0; i<(int)input.length/2 + input.length%2; i++)
      printSpiral(input, i);
  }

}