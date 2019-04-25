package leetcode.Apr22.linkedlist;

public class DeleteNode {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
  }

  public static void main(String[] args) {
    DeleteNode dn = new DeleteNode();
    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    ListNode delNode = new ListNode(3);
    root.next.next = delNode;
    root.next.next.next = new ListNode(4);
    root.next.next.next.next = new ListNode(5);
    printListNode(root);
    dn.deleteNode(delNode);
    printListNode(root);
  }

  private static void printListNode(ListNode root) {
    ListNode current = root;
    while (current != null) {
      System.out.print(current.val + "-->");
      current = current.next;
    }
    System.out.println();
  }

  private void deleteNode(ListNode delNode) {
    if(delNode.next != null) {
      delNode.val = delNode.next.val;
      delNode.next = delNode.next.next;
    }
  }

}
