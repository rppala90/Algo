package com.ravi.leetcode.tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MaxBinary {

  class Node {
    int data;
    int index;
    Node left;
    Node right;
    Node(int data) { this.data = data; }
  }

  private Node[] sortedArrayIndex(int[] input) {
    Integer[] tempArray = new Integer[input.length];
    HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();

    for(int i=0; i<input.length; i++) {
      temp.put(input[i], i);
      tempArray[i] = input[i];
    }

    Arrays.sort(tempArray, Collections.reverseOrder());


    Node[] nodeArray = new Node[input.length];
    for(int i=0; i<tempArray.length; i++) {
      nodeArray[i] = new Node(tempArray[i]);
      nodeArray[i].index = temp.get(tempArray[i]);
    }


    return nodeArray;
  }

  private Node buildTree(Node[] nodeArray) {
    Node root = nodeArray[0];
    for(int i=1; i<nodeArray.length; i++) {
      Node nextroot = root;
      Node nextNode = nodeArray[i];
      while(nextroot != null) {
        if(nextNode.index > nextroot.index) {
          if(nextroot.right == null) { nextroot.right = nextNode; break; }
          else nextroot = nextroot.right;
        } else {
          if(nextroot.left == null) { nextroot.left = nextNode; break; }
          else nextroot = nextroot.left;
        }
      }
    }
    return root;
  }

  private Node solution(int[] input) {
    Node[] nodeArray = sortedArrayIndex(input);
    return buildTree(nodeArray);
  }

  private static void printTree(Node root) {
    if(root == null) return;
    System.out.print(root.data);
    printTree(root.left);
    printTree(root.right);
  }

  public static void main(String args[]) {
    MaxBinary mb = new MaxBinary();
    int[] input = {3,2,1,6,0,5};
    printTree(mb.solution(input));
  }

}
