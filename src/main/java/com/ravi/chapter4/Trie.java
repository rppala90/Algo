package com.ravi.chapter4;

import java.util.HashMap;
import java.util.Map;

public class Trie {

  class TrieNode {
    private boolean isWord;
    private Map<Character, TrieNode> children = new HashMap<>();

    public Map<Character, TrieNode> getChildren() {
      return children;
    }

    public boolean isEndOfWord() {
      return isWord;
    }

    public void setEndOfWord(boolean isWord) {
      this.isWord = isWord;
    }
  }

  public TrieNode root = new TrieNode();

  public void insert(String word) {
    TrieNode current = root;
    for(int i=0; i<word.length(); i++) {
      current = current.getChildren().computeIfAbsent(word.charAt(i), c -> new TrieNode());
    }
    current.isWord = true;
  }

}
