package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class TripletsWithZeroTest {

  @Test
  public void testTriplets() {
    TripletsWithZero tz = new TripletsWithZero();
    int[] input = {0, -1, 2, -3, 1};
    assertEquals(true, tz.findTriplets(input, 5));
  }

  @Test
  public void testTriplets1() {
    TripletsWithZero tz = new TripletsWithZero();
    int[] input = {1, 2, 3};
    assertEquals(false, tz.findTriplets(input, 3));
  }

  @Test
  public void testTriplets2() {
    TripletsWithZero tz = new TripletsWithZero();
    int[] input = {54,77,8,-44,44,62,51,13,89,-26,20,52,30,43,51,19,97,25,57,-14,75,64,87,-10,88,64,40,-12,44,-77,43,8,15,-17,95,-14,37,-34,77,36,80,9,33,2,100,15,22,13,94,55,65,-12,4,14,7,-56,17,23,22,20,94,79,65,-67,67,40,42,-60,49,3,44,-27,17,-61,40,46,0,0,0,23,30,12,66,33};
    assertEquals(true, tz.findTriplets(input, 84));
  }

  @Test
  public void testTriplets3() {
    TripletsWithZero tz = new TripletsWithZero();
    int[] input = {34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};
    assertEquals(true, tz.findTriplets(input, 55));
  }

  @Test
  public void testTriplets4() {
    TripletsWithZero tz = new TripletsWithZero();
    int[] input = {32,11,50,20,59,-46,51,-11,38,-5,31,39,91,-52,2,47,67,-27,9,33,94,-82,27,-5,93,46,58,11,23,-60,36,1,65,34,73,11,24,-15,73,-7,50,78,62,-60,32,3,94,-21,52,2,96,71,90,-41,85,40,70,40,23,-53,5};
    assertEquals(true, tz.findTriplets(input, 61));
  }

  @Test
  public void testTriplets5() {
    TripletsWithZero tz = new TripletsWithZero();
    int[] input = {1, 1, -2};
    assertEquals(true, tz.findTriplets(input, 3));
  }

}
