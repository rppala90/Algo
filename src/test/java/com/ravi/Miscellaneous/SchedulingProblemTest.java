package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class SchedulingProblemTest {

  @Test
  public void testScheduling() {
    SchedulingProblem sp = new SchedulingProblem();
    int[] startTimes = {1,3,2,5,8,5};
    int[] endTimes = {2,4,6,7,9,9};
    assertEquals(4, sp.getCountJobsPossible(startTimes, endTimes));
  }

  @Test
  public void testScheduling1() {
    SchedulingProblem sp = new SchedulingProblem();
    int[] startTimes = {1,3,0,5,8,5};
    int[] endTimes = {2,4,6,7,9,0};
    assertEquals(5, sp.getCountJobsPossible(startTimes, endTimes));
  }

  @Test
  public void testScheduling2() {
    SchedulingProblem sp = new SchedulingProblem();
    int[] startTimes = {50, 74, 59, 31, 73, 45, 79, 24};
    int[] endTimes = {70, 75, 65, 44, 76, 73, 103, 32};
    assertEquals(4, sp.getCountJobsPossible(startTimes, endTimes));
  }

  @Test
  public void testScheduling3() {
    SchedulingProblem sp = new SchedulingProblem();
    int[] startTimes = {41,13,4,70,10,58,61,34,100,79,17,36,98,27,13,68,11,34,80,50,80,22,68,73,94,37,86,46,29,92};
    int[] endTimes = {66,21,16,94,39,63,90,55,125,106,18,50,121,44,23,83,23,48,108,69,99,36,97,75,120,51,102,51,53,99};
    assertEquals(8, sp.getCountJobsPossible(startTimes, endTimes));
  }
}
