package com.ravi.leetcode.contest;

public class MatrixCell {

  public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    int[][] op = new int[0][2];
    for(int i=0; i<R; i++) {
      for(int j=0; j<C; j++) {
        op[0][0] = 0;
        op[0][1] = 0;
      }
    }
    int[][] output = new int[R*C][];
    int col_out = 0;
    int[][] result = new int[1][1];
    for(int row=0; row<R; row++) {
      for(int column=0; column<C; column++) {
        int row0 = Math.abs(row - r0);
        int column0 = Math.abs(column-c0);
        output[0][col_out++] = row0;
        output[col_out++][1] = column0;
      }
    }
    return output;
  }

  public static  void main(String args[]) {
    MatrixCell mc = new MatrixCell();
    mc.allCellsDistOrder(1, 2, 0, 0);
  }

}
