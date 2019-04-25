package leetcode.Apr22.linkedlist;

public class NthToLast {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val;}
  }

  public static void main(String[] args) {
    NthToLast nl = new NthToLast();
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(5);
    System.out.println(nl.nthToLast(root, 5));
  }

  private int nthToLast(ListNode root, int nFromLast) {
    ListNode current = root;
    for(int i=0; i<nFromLast; i++) {
      if(current!=null) current = current.next;
    }
    ListNode secondNode = root;
    while(current!= null) {
      current = current.next;
      secondNode = secondNode.next;
    }
    return secondNode.val;
  }

}
