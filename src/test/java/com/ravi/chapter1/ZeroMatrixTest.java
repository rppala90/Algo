package com.ravi.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZeroMatrixTest {

  ZeroMatrix zm = new ZeroMatrix();

  @Test
  public void zeroMatrixTest() {
    int N = 4;
    int[][] input = new int[N][N];
    int k=1;
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        if(k%7==0) {
          input[i][j] = 0;
          k++;
        } else {
          input[i][j] = k++;
        }
      }
    }
    RotateMatrix.printMatrix(input);
    int[][] output = zm.zeroMatrix(input);
    RotateMatrix.printMatrix(output);
    assertEquals(output[0][0], 1);
    assertEquals(output[0][3], 4);
    assertEquals(output[0][2], 0);
    assertEquals(output[2][2], 0);
  }

}
