package com.ravi.leetcode.facebook;

import com.ravi.leetcode.facebook.MergeKLists.ListNode;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import org.junit.Test;

public class MergeKListsTest {

  class ListNodeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
      int first = (Integer)o1;
      int second = (Integer)o2;
      return first-second;
    }
  }

  @Test
  public void mergeListsTest() {
    MergeKLists mList = new MergeKLists();
    List l1 = new LinkedList();
    l1.add(-1);
    l1.add(-4);
    l1.add(-5);
    List l2 = new LinkedList();
    List[] lists = {l1, l2};

    PriorityQueue pq = new PriorityQueue(new ListNodeComparator());
    for(List x: lists) {
      for(Object obj: x) {
        pq.add(obj);
      }

    }

    while(! pq.isEmpty()) {
      System.out.print(pq.remove()+" ");
    }
    System.out.println();
    mList.mergeKListsArr(lists);
    /*
    List l2 = new LinkedList();
    l2.add(1);
    l2.add(3);
    l2.add(4);
    List l3 = new LinkedList();
    l3.add(2);
    l3.add(6);
    List[] lists = {l1, l2, l3};
    mList.mergeKListsArr(lists);*/
  }

}
