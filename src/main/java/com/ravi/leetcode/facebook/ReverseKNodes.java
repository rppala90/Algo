package com.ravi.leetcode.facebook;

public class ReverseKNodes {

  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
  }

  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode first = head;
    ListNode second = first.next;
    for(int i=1; i<k; i++) {
      first.next = second.next;
      second.next = first;
      head = second;
      second = first.next;
    }
    return head;
  }

}
