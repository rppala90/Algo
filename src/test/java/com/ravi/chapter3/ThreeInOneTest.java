package com.ravi.chapter3;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class ThreeInOneTest {

  ThreeInOne tio = new ThreeInOne(10);

  @Test(expected = ThreeInOne.StackFullException.class)
  public void testStackFull() throws ThreeInOne.StackFullException{
    for(int i=0; i<11; i++)
      tio.pushStack(1, i);
  }

  @Test(expected = ThreeInOne.StackFullException.class)
  public void testSecondStackFull() throws ThreeInOne.StackFullException{
    for(int i=0; i<11; i++)
      tio.pushStack(2, i);
  }

  @Test(expected = ThreeInOne.StackFullException.class)
  public void testThirdStackFull() throws ThreeInOne.StackFullException{
    for(int i=0; i<11; i++)
      tio.pushStack(3, i);
  }

  @Test
  public void testStack()  throws ThreeInOne.StackFullException, ThreeInOne.StackEmptyException {
    for(int i=0; i<10;i++) {
      tio.pushStack(1, i);
      tio.pushStack(2, i);
      tio.pushStack(3, i);
    }
    int stack1Top = tio.popStack(1);
    int stack2Top = tio.popStack(2);
    int stack3Top = tio.popStack(3);
    assertEquals(stack1Top, stack2Top);
    assertEquals(stack2Top, stack3Top);
  }

  @Test(expected = ThreeInOne.StackEmptyException.class)
  public void testStackPop() throws ThreeInOne.StackEmptyException {
    tio.popStack(1);
  }

  @Test(expected = ThreeInOne.StackEmptyException.class)
  public void testStack2Pop() throws ThreeInOne.StackEmptyException {
    tio.popStack(2);
  }

  @Test(expected = ThreeInOne.StackEmptyException.class)
  public void testStack3Pop() throws ThreeInOne.StackEmptyException {
    tio.popStack(3);
  }

  @Test
  public void testStackPushPop()  throws ThreeInOne.StackFullException,
      ThreeInOne.StackEmptyException {
    for (int i = 0; i < 10; i++) {
      tio.pushStack(1, i);
      tio.pushStack(2, i);
      tio.pushStack(3, i);
    }
    for (int i = 0; i < 10; i++) {
      tio.popStack(1);
      tio.popStack(2);
      tio.popStack(3);
    }
  }

}