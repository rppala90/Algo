package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import com.ravi.leetcode.facebook.ReverseKNodes.ListNode;
import org.junit.Test;

public class ReverseKNodesTest {

  @Test
  public void testReverseNodes() {
    ReverseKNodes rn = new ReverseKNodes();
    ListNode head = new ListNode(1);
    ListNode incre = head;
    for(int i=2; i<=6; i++) {
      incre.next = new ListNode(i);
      incre = incre.next;
    }
    assertEquals("214365", getVal(rn.reverseKGroup(head, 2)));
  }

  private String getVal(ListNode head) {
    StringBuilder sb = new StringBuilder();
    while(head!=null) {
      sb.append(head.val);
      head = head.next;
    }
    return sb.toString();
  }

}
