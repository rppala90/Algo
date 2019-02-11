package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class PalindromeNoSpacesTest {

  @Test
  public void testPalindrome() {
    PalindromeNoSpaces pn = new PalindromeNoSpaces();
    assertEquals("YES", pn.isPalindrome("race car"));
  }

  @Test
  public void testPalindrome1() {
    PalindromeNoSpaces pn = new PalindromeNoSpaces();
    assertEquals("NO", pn.isPalindrome("abcaa"));
  }

  @Test
  public void testPalindrome2() {
    PalindromeNoSpaces pn = new PalindromeNoSpaces();
    assertEquals("NO", pn.isPalindrome("ydbmsecweibrqagpoiaqbnylgqxdrfcrlgf fkjbquehkeqzsyalbpjnyzmbsugmfmrkydl qxsyhwqjrolcpaneymrcglkssykcyppomjm tieezspdkqsoqehukuefmcrqcgirsrfnzks aehfozxfsdmmqjtvxxmqasarktwzvgrxlbd bacgsgvhwgatdxfvxzvolpnkmvcjidokfrs azphvvhqbexwcwusjlhtxdxincxziosinjp khwciczggxcbgnizmnzvbbuajkutxeijlgl vlmdrjgupvfqispfvrzwcjsyiyitjpggcsk vbqqslvivpaaltbjvmbtuccnltvuxnesowk"));
  }

  @Test
  public void testPalindrome3() {
    PalindromeNoSpaces pn = new PalindromeNoSpaces();
    assertEquals("YES", pn.isPalindrome("nama n"));
  }


  @Test
  public void testPalindrome4() {
    PalindromeNoSpaces pn = new PalindromeNoSpaces();
    assertEquals("NO", pn.isPalindrome("ocyeemgxnwmzjctnfktsmvb"));
  }
}
