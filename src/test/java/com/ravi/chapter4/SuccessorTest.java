package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import org.junit.Test;

public class SuccessorTest {

  Successor s = new Successor();
  Successor.TreeNode[] nodes = new Successor.TreeNode[10];


  @Test
  public void successorTest() {
    int[] input = new int[10];
    for(int i=0; i<10; i++) {
      input[i] = i;
    }
    Successor.TreeNode st = buildTree(input);
    System.out.println("Printing Tree :");
    TreeTraversal.inOrderTraversal(st);
    System.out.println();
    assertEquals(4, s.successor(nodes[3]).data);
    assertEquals(5, s.successor(nodes[4]).data);
    assertEquals(1, s.successor(nodes[0]).data);
  }

  private Successor.TreeNode buildTree(int[] input) {
    return buildTreeHelper(input, 0, input.length-1);
  }

  private Successor.TreeNode buildTreeHelper(int[] input, int start, int end) {
    if(start > end) return null;
    int current = (start+end) / 2;
    Successor.TreeNode root = s.new TreeNode();
    root.data = input[current];
    root.left = buildTreeHelper(input, start, current-1);
    root.right = buildTreeHelper(input, current+1, end);
    if( root.left != null) ((Successor.TreeNode) root.left).parent = root;
    if( root.right != null) ((Successor.TreeNode) root.right).parent = root;
    nodes[current] = root;
    return root;
  }

}
