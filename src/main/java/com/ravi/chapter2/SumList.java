package com.ravi.chapter2;

/*
 * 617 ==>   7 -> 1 -> 6 -> /
 * 295 ==>   5 -> 9 -> 2 -> /
 * Sum is:
 * 912 ==>  2 -> 1 -> 9 -> /
 */
public class SumList {

  public LinkedListNode sumList(LinkedListNode s1, LinkedListNode s2) {
    int carry = 0;
    LinkedListNode output = null, outputHead = null;
    while(s1!=null && s2 != null) {
      int data = s1.data + s2.data + carry;
      carry = data / 10;
      data =  data % 10;
      LinkedListNode temp = new LinkedListNode(data);
      if( output == null ) { output = temp; outputHead = output; }
      else { output.next = temp; output = output.next; }
      s1 = s1.next;
      s2 = s2.next;
    }
    LinkedListNode remainingNodes = (s1==null) ? s2: s1;
    while(remainingNodes!=null) {
      int data = carry > 0 ? remainingNodes.data + carry : remainingNodes.data;
      LinkedListNode temp = new LinkedListNode(data);
      if( output == null ) { output = temp; outputHead = output; }
      else { output.next = temp; output = output.next; }
      remainingNodes = remainingNodes.next;
    }
    return outputHead;
  }

}
