package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrieTest {

  Trie t = new Trie();

  @Test
  public void testTrie() {
    t.insert("AlgoPractice");
    t.insert("AlgoPractice1");
    Trie.TrieNode root = t.root;
    StringBuilder output = new StringBuilder();
    while(! root.getChildren().isEmpty()) {
      root.getChildren().keySet().forEach((x) -> output.append(x));
      root = (Trie.TrieNode) root.getChildren().values().toArray()[0];
    }
    assertEquals(output.toString(), "AlgoPractice1");
  }

}
