package com.ravi.chapter1;


/*
 * If an element in an M X N  matrix is zero then its entire row and column are set to 0.
 */
public class ZeroMatrix {

  public int[][] zeroMatrix(int[][] input) {

    boolean firstRowZero = false;
    boolean firstColumnZero = false;
    for(int i=0;i<input.length;i++) {
      if(input[0][i] == 0) {
        firstRowZero = true;
        break;
      }
    }
    for(int i=0;i<input.length;i++) {
      if(input[i][0] == 0) {
        firstColumnZero = true;
        break;
      }
    }
    // Set first row and column to zero
    for(int i=1; i<input.length; i++) {
      for (int j = 1; j < input[0].length; j++) {
        if (input[i][j] == 0) {
          input[0][j] = 0;
          input[i][0] = 0;
        }
      }
    }
      // If first row or column is zero then set whole row and column as zero.
      for(int i=1;i<input.length;i++) {
        if(input[0][i]==0) {
            for(int j=1; j<input.length;j++) {
              input[j][i] = 0;
            }
        }
        if(input[i][0]==0) {
          for(int j=1; j<input.length;j++) {
            input[i][j] = 0;
          }
        }
      }
      if(firstColumnZero) {
        for(int i=0;i<input.length;i++) {
          input[i][0] = 0;
        }
      }
      if(firstRowZero) {
        for(int i=0;i<input.length;i++) {
          input[0][i] = 0;
        }
      }
      return input;
  }

}
