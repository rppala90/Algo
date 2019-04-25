package leetcode.Apr22.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val;}
  }

  public static void main(String[] args) {
    RemoveDuplicates rd = new RemoveDuplicates();
    ListNode root = new ListNode(1);
    root.next = new ListNode(6);
    root.next.next = new ListNode(5);
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(3);
    root.next.next.next.next.next = new ListNode(2);
    printNode(rd.removeDups(root));
  }

  private static void printNode(ListNode root) {
    ListNode current = root;
    while(current!=null) {
      System.out.print(current.val + "-->");
      current = current.next;
    }
  }

  private ListNode removeDups(ListNode root) {
    if(root==null) return null;
    HashSet<Integer> cache = new HashSet<Integer>();
    ListNode current = root.next, prevPointer = root;
    if(prevPointer!=null)cache.add(prevPointer.val);
    while(current != null) {
      if(cache.contains(current.val)) {
        prevPointer.next = current.next;
      } else {
        cache.add(current.val);
        prevPointer = current;
      }
      current = current.next;
    }
    return root;
  }

}
