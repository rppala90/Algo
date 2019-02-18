package com.ravi.leetcode.facebook;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LetterComboTest {

  @Test
  public void letterCombotest() {
    String digits = "23";
    LetterCombo lc = new LetterCombo();
    assertEquals(9, lc.letterCombinations(digits).size());
  }

}