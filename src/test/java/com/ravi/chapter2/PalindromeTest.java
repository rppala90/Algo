package com.ravi.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {

  Palindrome p = new Palindrome();

  @Test
  public void palindromeCheck() {
    LinkedListNode input = new LinkedListNode(0);
    LinkedListNode head = input;
    for(int i=1; i<10; i++) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input=input.next;
    }
    assertEquals("0123456789", LinkedListNode.listToString(head));
    assertEquals(false, p.checkPalindrome(head));

    for(int i=9; i>=0; i--) {
      LinkedListNode temp = new LinkedListNode();
      temp.data = i;
      input.next = temp;
      input=input.next;
    }
    assertEquals("01234567899876543210", LinkedListNode.listToString(head));
    assertEquals(true, p.checkPalindrome(head));

    head = new LinkedListNode(1);
    head.next = new LinkedListNode(1);
    assertEquals(true, p.checkPalindrome(head));

    head = new LinkedListNode(1);
    head.next = new LinkedListNode(2);
    head.next.next = new LinkedListNode(1);
    assertEquals(true, p.checkPalindrome(head));

  }

}
