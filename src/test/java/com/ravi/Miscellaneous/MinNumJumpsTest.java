package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MinNumJumpsTest {

  @Test
  public void testminSteps() {
    int[] input = {1,3,5,8,9,2,6,7,6,8,9};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(3, mJumps.minSteps(input));
  }

  @Test
  public void testwithzero() {
    int[] input1 = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(4, mJumps.minSteps(input1));
  }

  @Test
  public void anotherTest() {
    int[] input = {47,76,55,13,2,48,46,27,12,37,99,25,48,83,20,77,13,9,35,55,62,76,57,18,72,64,10,4,64,74,63,77,15,18,91,84,32,36,77,10,39,75,35,87,23,22,30,37,31,65,58,59,7,14,78,79,45,54,83,8,94,12,86,9,97,42,93,95,44,70,5,83,10,40,36,34,62,66,71,59,97,95,18,3,8,62,48,19,15,98,28,8,9};
    //for(int i=0; i<input.length; i++) System.out.println(i + "---> " + input[i]);
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(2, mJumps.minSteps(input));
  }

  @Test
  public void anotherTestcase() {
    int[] input = {2,2,0,4};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(2, mJumps.minSteps(input));
  }

  @Test
  public void anotherTestcase1() {
    int[] input = {5,9,3,2,1,0,2,3,3,1,0,0};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(3, mJumps.minSteps(input));
  }

  @Test
  public void anotherTestcase2() {
    int[] input = {1,2,1,1,1};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(3, mJumps.minSteps(input));
  }

  @Test
  public void anotherTestcase3() {
    int[] input = {10,9,8,7,6,5,4,3,2,1,1,0};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(2, mJumps.minSteps(input));
  }

  @Test
  public void anotherTestcase4() {
    int[] input = {0};
    MinNumJumps mJumps = new MinNumJumps();
    assertEquals(0, mJumps.minSteps(input));
  }

}
