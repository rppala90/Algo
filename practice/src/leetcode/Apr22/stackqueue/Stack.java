package leetcode.Apr22.stackqueue;

public class Stack {

  StackNode top;

  static class StackNode {
    int val;
    StackNode next;
    StackNode(int val) {this.val = val;}
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
  }

  private void push(int i) {
    StackNode s = new StackNode(i);
    s.next = top;
    top = s;
  }

  private int pop() {
    StackNode current = top;
    top = top.next;
    current.next = null;
    return current.val;
  }

}
