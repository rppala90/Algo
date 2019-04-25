package com.ravi.leetcode.facebook;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

  int CAPACITY;

  Deque<Integer> keys;
  HashMap<Integer, Integer> contents;


  public LRUCache(int capacity) {
      this.CAPACITY = capacity;
      keys = new LinkedList<Integer>();
      contents = new HashMap<Integer, Integer>();
  }

  public int get(int key) {
    if( ! contents.containsKey(key)) return -1;
    keys.removeLastOccurrence(key);
    keys.addLast(key);
    return contents.get(key);
  }

  public void put(int key, int value) {
    if(keys.size() == this.CAPACITY && ! contents.containsKey(key)) {
      int lastKey = keys.removeFirst();
      contents.remove(lastKey);
    }
    if(contents.containsKey(key)) {
      get(key);
      contents.put(key, value);
    } else {
      keys.addLast(key);
      contents.put(key, value);
    }
  }

  public static void main(String args[]) {
    LRUCache cache = new LRUCache( 2 /* capacity */ );
    cache.put(2, 1);
    cache.put(1, 1);
    cache.put(2, 3);
    cache.put(4, 1);
    System.out.println(cache.get(1));
    System.out.println(cache.get(2));
  }

}
