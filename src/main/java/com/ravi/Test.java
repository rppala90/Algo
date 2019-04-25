package com.ravi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

  static class Node {
    String color = "OLDCOLOR";
    boolean visited = false;
    Node() { this.color = "OLDCOLOR";}
  }

  private static void printInput(Node[][] input) {
    for(int i=0; i<input.length; i++) {
      for(int j=0; j<input.length; j++) {
        System.out.print(input[i][j].color+ "|");
      }
      System.out.println();
    }
  }
  private static void fillWithColor(int row_column, int row, int column) {
    Node[][] input = new Node[row_column][row_column];
    for(int i=0; i<row_column; i++) {
      for(int j=0; j<row_column; j++) {
        input[i][j] = new Node();
      }
    }
    input[row_column-1][row_column-2].color = "NEWCOLOR";

    printInput(input);
    fillWithColorRecurse(input, row, column);
    System.out.println();
    printInput(input);
  }

  private static void fillWithColorRecurse(Node[][] input, int row, int column) {
    if(row<0 || row > input.length-1 || column <0 || column > input.length-1) return;
    if(input[row][column].color == "NEWCOLOR" && ! input[row][column].visited) return;
    if(input[row][column].visited) return;
    else {
      input[row][column].color = "NEWCOLOR";
      input[row][column].visited = true;
      fillWithColorRecurse(input, row, column-1);
      fillWithColorRecurse(input, row, column+1);
      fillWithColorRecurse(input, row-1, column);
      fillWithColorRecurse(input, row+1, column);
    }
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int row_column = s.nextInt();
    fillWithColor(row_column, row_column-2, row_column-2);
  }

}
