package com.ravi.chapter2;

public class Partition {

  public LinkedListNode partitionList(LinkedListNode input, int pivot) {
    LinkedListNode current = input;
    LinkedListNode low=null , high=null, lowHead=null, highHead=null;
    while(current != null) {
      LinkedListNode temp = current;
      current = current.next;
      temp.next = null;
      if(temp.data<pivot) {
        if(low==null) {
          low = temp;
          lowHead = low;
        } else {
          low.next = temp;
          low = low.next;
        }
      } else {
        if(high==null) {
          high = temp;
          highHead = high;
        } else {
          high.next = temp;
          high = high.next;
        }
      }
    }
    if(lowHead == null) lowHead = highHead;
    else low.next = highHead;
    return lowHead;
  }

}
