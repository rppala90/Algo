package com.ravi.leetcode.facebook;

public class ReverseKNodes {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
  }

  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode current = head, output = head, tail = null;
    int i=0;
    while(current != null && length(current) >= k) {
      ListNode[] temp = reverseKNodes(current, k, tail);
      if(i++==0) head = temp[0];
      tail = temp[1];
      current = temp[2];
    }
    return head;
  }

  private int length(ListNode head) {
    ListNode current = head;
    int output = 0;
    while(current!=null) {
      output++;
      current  = current.next;
    }
    return output;
  }

  public ListNode[] reverseKNodes(ListNode head, int k, ListNode prevTail) {
    ListNode tail = head;
    ListNode current = head.next;
    for(int i=1; i<k && current != null; i++) {
      tail.next = current.next;
      current.next = head;
      head = current;
      current = tail.next;
    }
    ListNode[] output = {head, tail, current};
    if(prevTail!= null) prevTail.next = head;
    return output;
  }

}
