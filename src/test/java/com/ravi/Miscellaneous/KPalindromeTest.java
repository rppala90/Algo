package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class KPalindromeTest {

  @Test
  public void test_is_k_palindrome() {
    KPalindrome kp = new KPalindrome();
    assertEquals(true, kp.is_k_palin("abcdecba", 1));
  }

  @Test
  public void test_is_k_palindrome1() {
    KPalindrome kp = new KPalindrome();
    assertEquals(false, kp.is_k_palin("acdcb", 1));
  }

  @Test
  public void test_is_k_palindrome2() {
    KPalindrome kp = new KPalindrome();
    assertEquals(false, kp.is_k_palin("xtigsieehkchzdflilrjq", 14));
  }

  @Test
  public void test_is_k_palindrome3() {
    KPalindrome kp = new KPalindrome();
    assertEquals(true, kp.is_k_palin("abaa", 1));
  }

}
