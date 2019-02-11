package com.ravi.Miscellaneous;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FloydWarshallTest {

  private static int MAX = 100000;

  @Test
  public void testFloydWarshall() {
      int[][] graph = {{0, 5, MAX, 10},
          {MAX, 0, 3, MAX},
          {MAX, MAX, 0, 1},
          {MAX, MAX, MAX, 0}};

      FloydWarshall fw = new FloydWarshall();
      int[][] shortDistActual = fw.shortestPath(graph);

      int[][] shortDistExpected = {{0,5,8,9},
                                  {MAX,0,3,4},
                                  {MAX, MAX, 0, 1},
                                  {MAX, MAX, MAX, 0}};

      for(int i=0; i<graph.length; i++) {
        for(int j=0; j<graph.length; j++) {
          assertEquals(shortDistExpected[i][j], shortDistActual[i][j]);
        }
      }
  }

}