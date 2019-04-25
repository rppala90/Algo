package leetcode.Apr22.linkedlist;

public class TortoiseHare {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val;}
  }

  public static void main(String[] args) {
    TortoiseHare th = new TortoiseHare();

    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    ListNode loopNode = new ListNode(3);
    root.next.next = loopNode;
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(5);
    root.next.next.next.next.next = new ListNode(6);
    root.next.next.next.next.next.next = loopNode;

    System.out.println(th.beginLoop(root).val);
  }

  private ListNode beginLoop(ListNode root) {
    ListNode slow = root;
    ListNode fast = root;
    //Meeting point
    while(fast != null && fast.next!= null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) break;
    }
    if(fast!=null) {
      slow = root;
      while(slow!=fast) {
        slow = slow.next;
        fast = fast.next;
      }
    }
    return slow;
  }

}
