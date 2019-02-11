package com.ravi.chapter3;

/*
 * Single array to implement three stacks
 */
public class ThreeInOne {

  private int N;
  private int[] contents;

  private int stackOneTop;
  private int stackTwoTop;
  private int stackThreeTop;

  public ThreeInOne(int stackSize) {
    N = stackSize;
    contents = new int[3*N];
    stackOneTop = 0;
    stackTwoTop = N;
    stackThreeTop = 2*N;
  }

  public void pushStack(int stackNum, int data) throws StackFullException {
    switch(stackNum) {
      case 1:
        if(stackOneTop==N) {
          throw new StackFullException("Stack Full Exception");
        }
        contents[stackOneTop++] = data;
        break;
      case 2:
        if(stackTwoTop==2*N) {
          throw new StackFullException("Stack Full Exception");
        }
        contents[stackTwoTop++] = data;
        break;
      case 3:
        if(stackThreeTop==3*N) {
          throw new StackFullException("Stack Full Exception");
        }
        contents[stackThreeTop++] = data;
        break;
      default:
        throw new RuntimeException("Wrong Stack Number");
    }
  }

  public int popStack(int stackNum) throws StackEmptyException {
    int retVal = Integer.MIN_VALUE;
    switch(stackNum) {
      case 1:
        if(stackOneTop==0) {
          throw new StackEmptyException("Stack Empty Exception");
        }
        retVal = contents[--stackOneTop];
        break;
      case 2:
        if(stackTwoTop==N) {
          throw new StackEmptyException("Stack Empty Exception");
        }
        retVal = contents[--stackTwoTop];
        break;
      case 3:
        if(stackThreeTop==2*N) {
          throw new StackEmptyException("Stack Empty Exception");
        }
        retVal = contents[--stackThreeTop];
        break;
      default:
        throw new RuntimeException("Wrong Stack Number");
    }
    return retVal;
  }


  static class StackFullException extends Exception{
    public StackFullException(String message) {
      super(message);
    }
  }

  static class StackEmptyException extends Exception{
    public StackEmptyException(String message) {
      super(message);
    }
  }

}
