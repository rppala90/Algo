package leetcode.Apr22.chapter1;

import java.util.LinkedList;
import java.util.List;

public class RowColumnZero {

  /*
  Write an algorithm such that if an element in an MxN matrix is 0,
    its entire row and column is set to 0.
   */

  public static void main(String[] args) {
    RowColumnZero rz = new RowColumnZero();
    int[][] input = {{1,2,3},{4,5,6},{5,6,7}};
    printMatrix(input);
    System.out.println();
    rz.setZero(input);
    printMatrix(input);
  }

  private static void printMatrix(int[][] input) {
    for(int i=0; i<input.length; i++) {
      for(int j=0; j<input[0].length; j++) {
        System.out.print(input[i][j]+ " ");
      }
      System.out.println();
    }
  }

  private void setZero(int[][] input) {

    List<Integer> firstRowZeros = new LinkedList<Integer>();
    List<Integer> firstColumnZeros = new LinkedList<Integer>();

    for(int j=0; j<input[0].length; j++) {
      if(input[0][j] == 0) firstRowZeros.add(j);
    }

    for(int i=0; i<input.length; i++) {
      if(input[i][0] == 0) firstColumnZeros.add(i);
    }


    for(int i=1; i<input.length; i++) {
      for (int j = 1; j < input[0].length; j++) {
        if (input[i][j] == 0) {
          input[i][0] = 0;
          input[0][j] = 0;
        }
      }
    }

        for(int j=1; j<input[0].length;j++) {
          if(input[0][j] == 0) {
            for(int i=1; i<input.length; i++) {
              input[i][j] = 0;
            }
          }
        }

        for(int i=1; i<input.length; i++) {
          if(input[i][0] == 0) {
            for(int j=1; j<input[0].length;j++) {
              input[i][j] = 0;
            }
          }
        }

        for(int j: firstRowZeros) {
          for(int i=0; i<input.length; i++) {
            input[i][j] = 0;
          }
        }

    for(int i: firstColumnZeros) {
      for(int j=0; j<input[0].length; j++) {
        input[i][j] = 0;
      }
    }
    if(! firstColumnZeros.isEmpty()) {
      for(int i=0; i<input.length; i++) {
        input[i][0] = 0;
      }
    }

    if(! firstRowZeros.isEmpty()) {
      for(int j=0; j<input[0].length; j++) {
        input[0][j] = 0;
      }
    }
  }

}
