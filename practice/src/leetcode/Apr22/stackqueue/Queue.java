package leetcode.Apr22.stackqueue;

public class Queue {

  Node first, last;

  static class Node {
    int val;
    Node next;
    Node(int val) { this.val = val;}
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
  }

  private void enqueue(int i) {
    if(last == null) {
      first = new Node(i);
      last = first;
    }else {
      Node current = new Node(i);
      last.next = current;
      last = current;
    }
  }

  private int dequeue() {
    Node current = first;
    first = first.next;
    current.next = null;
    return current.val;
  }

}
