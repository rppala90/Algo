package com.ravi.chapter2;

public class LinkedListNode {

  int data;
  LinkedListNode next;

  public LinkedListNode(int data) {
    this.data = data;
  }

  public LinkedListNode() {
  }

  public static void printList(LinkedListNode input) {
    while(input != null) {
      System.out.print(input.data + "--> ");
      input = input.next;
    }
    System.out.println("X");
  }

  public static int size(LinkedListNode input) {
    int size = 0;
    while(input != null) {
      size++;
      input = input.next;
    }
    return size;
  }

  public static String listToString(LinkedListNode head) {
    LinkedListNode current = head;
    StringBuilder output =  new StringBuilder();
    do{
      output.append(current.data);
    } while((current=current.next)!=null);
    return output.toString();
  }
}
