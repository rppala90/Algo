package com.ravi.Miscellaneous;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class WordClass2Test {

  @Test
  public void testWordClass() {
    WordSearch2 ws = new WordSearch2();
    String[] words = {"oath","pea","eat","rain"};
    char[][] board = {
        {'o', 'a', 'a', 'n'},
        {'e', 't', 'a', 'e'},
        {'i', 'h', 'k', 'r'},
        {'i', 'f', 'l', 'v'}
      };
    assertEquals(2, ws.findWords(board, words).size());
  }

  @Test
  public void testWordClass1() {
    WordSearch2 ws = new WordSearch2();
    String[] words = {"a", "a"};
    char[][] board = {
        {'a'}
    };
    assertEquals(1, ws.findWords(board, words).size());
  }

  @Test
  public void testWordClass2() {
    WordSearch2 ws = new WordSearch2();
    String[] words = {"ba"};
    char[][] board = {
        {'a', 'b'}
    };
    assertEquals(1, ws.findWords(board, words).size());
  }

  @Test
  public void testWordClass3() {
    WordSearch2 ws = new WordSearch2();
    String[] words = {"acdb"};
    char[][] board = {
        {'a', 'b'},
        {'c','d'}
    };
    assertEquals(1, ws.findWords(board, words).size());
  }

}
