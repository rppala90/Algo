package com.ravi.triplebyte;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tictactoe {

  private final int N = 3;

  private char[][] board;

  public Tictactoe() {
    board = new char[N][N];
    initializeBoard();
  }

  enum Token {
    X('X'), O('O'), S('-');

    private final char val;

    Token(char val) { this.val = val;}

    public char getVal() { return this.val; }
  }

  private void initializeBoard() {
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        board[i][j] = Token.S.getVal();
      }
    }
  }

  public void addToken(Token t, int row, int column) {
    board[row][column] = t.getVal();
    printBoard();
  }

  public void printBoard() {
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        if(j!=N-1)
          System.out.print(board[i][j]+"|");
        else
          System.out.print(board[i][j]);
      }
      System.out.println();
    }
  }

  private boolean isFull() {
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        if(board[i][j] == Token.S.getVal()) return false;
      }
    }
    return true;
  }

  private void makeMove() throws Exception{
    if( isFull() ) throw new Exception("Board is Full.");
    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        if(board[i][j] == Token.S.getVal()) {
          addToken(Token.O, i, j);
          return;
        }
      }
    }
  }

  private int[] takeUserInput() {
    int[] input = new int[2];
    Scanner s = new Scanner(System.in);
    try {
      input[0] = s.nextInt();
      input[1] = s.nextInt();
      if(input[0] < 0 || input[0] >2 || input[1] < 0 || input[1] > 2) {
        throw new InputMismatchException();
      }
    } catch(InputMismatchException ime) {
      System.out.println("Valid values are from 0-2");
      takeUserInput();
    }
    return input;
  }

  public static void main(String args[]) throws Exception{
    Tictactoe t = new Tictactoe();
    while (!t.isFull()) {
      int[] userMove = t.takeUserInput();
      t.addToken(Token.X, userMove[0], userMove[1]);
      t.makeMove();
    }
  }

}
