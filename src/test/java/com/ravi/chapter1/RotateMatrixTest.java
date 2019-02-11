package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateMatrixTest {

  RotateMatrix rm = new RotateMatrix();

  @Test
  public void rotateMatrixTest() {
    int N = 4;
    int[][] input = new int[N][N];
    int k=0;
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        input[i][j] = k++;
      }
    }
    RotateMatrix.printMatrix(input);
    int[][] output = rm.rotateMatrix(input);
    RotateMatrix.printMatrix(output);
    assertEquals(input[0][0], output[0][3]);
    assertEquals(input[2][0], output[0][1]);
  }

}