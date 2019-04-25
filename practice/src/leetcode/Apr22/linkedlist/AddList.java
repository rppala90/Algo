package leetcode.Apr22.linkedlist;

public class AddList {

  static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode() {}
  }

  public static void main(String[] args) {
    AddList al = new AddList();
    ListNode root1 = new ListNode(3);
    root1.next = new ListNode(1);
    root1.next.next = new ListNode(5);

    ListNode root2 = new ListNode(5);
    root2.next = new ListNode(9);
    root2.next.next = new ListNode(2);

    ListNode sum = al.addTwoList(root1, root2);
    printListNode(sum);
  }

  private static void printListNode(ListNode root) {
    ListNode current = root;
    while(current!=null) {
      System.out.print(current.val+"-->");
      current = current.next;
    }
    System.out.println();
  }

  private ListNode addTwoList(ListNode root1, ListNode root2) {
    ListNode output = new ListNode();
    int carry = 0;
    ListNode current1 = root1;
    ListNode current2 = root2;
    ListNode current3 = output;
    while(current1 != null && current2 != null) {
      int val = current1.val + current2.val + carry;
      System.out.println(val);
      if(val > 9) {
        carry = 1;
        val = val%10;
      } else {
        carry = 0;
      }
      current3.val = val;
      current1 = current1.next;
      current2 = current2.next;
      if(current1!= null && current2!=null) {
        current3.next = new ListNode();
        current3 = current3.next;
      }
    }
    return output;
  }

}
