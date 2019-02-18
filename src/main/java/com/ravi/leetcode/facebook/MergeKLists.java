package com.ravi.leetcode.facebook;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKLists {

  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  class ListNodeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
      ListNode first = (ListNode) o1;
      ListNode second = (ListNode) o2;
      return first.val-second.val;
    }
  }

  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new ListNodeComparator());
    for(ListNode l: lists) {
      while(l!=null) {
        pq.add(l);
        l = l.next;
      }
    }
    ListNode head = null, curr = null;
    if(! pq.isEmpty()) {
      curr = pq.remove();
      head = curr;
    }
    while(! pq.isEmpty()) {
      curr.next = pq.remove();
      curr = curr.next;
    }
    if(curr!=null) curr.next=null;
    return head;
  }

  public ListNode mergeKListsArr(List<Integer>[] lists) {
    ListNode[] listNodes = new ListNode[lists.length];
    int i=0;
    for(List<Integer> list :lists) {
      ListNode head = null, current = null;
      for(int x: list) {
        if(current != null) {
          current.next = new ListNode(x);
          current = current.next;
        } else {
          current = new ListNode(x);
          head = current;
        }
      }
      listNodes[i++] =  head;
    }
    ListNode output = mergeKLists(listNodes);
    ListNode current = output;
   while(current != null) {
      System.out.print(current.val+" ");
      current = current.next;
    }
    System.out.println();
    return output;
  }

}
