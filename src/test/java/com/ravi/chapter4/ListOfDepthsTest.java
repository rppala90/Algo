package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;

public class ListOfDepthsTest {

  MinimalTree mt = new MinimalTree();
  ListOfDepths lod = new ListOfDepths();

  @Test
  public void testdepth() {

    int[] input = new int[10];

    for(int i=0; i<10; i++) {
      input[i] = i;
    }
    ArrayList<LinkedList<TreeNode>> output = lod.listOfDepths(mt.buildTree(input));
    assertEquals(4, output.size());
    assertEquals(1, output.get(0).size());
    assertEquals(2, output.get(1).size());
    assertEquals(4, output.get(2).size());
    assertEquals(3, output.get(3).size());
  }

}
