package com.ravi.chapter1;

public class RotateMatrix {

  public int[][] rotateMatrix(int[][] input) {
    int N = input.length-1;
    int[][] output = new int[N+1][N+1];
    for(int i=0; i<=N; i++) {
      for (int j = 0; j <= N; j++) {
        output[i][j] = input[i][j];
      }
    }
    for(int i=0; i<=N; i++) {
      for(int j=0; j<=N; j++) {
        output[i][j] = input[N-j][i];
      }
    }
    return output;
  }

  public static void printMatrix(int[][] input) {
    for(int i=0; i<input.length; i++) {
      for (int j = 0; j <input[0].length; j++) {
          System.out.print(input[i][j] + " ");
      }
      System.out.println();
    }
  }
}
