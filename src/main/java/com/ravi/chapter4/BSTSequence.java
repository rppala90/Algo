package com.ravi.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

public class BSTSequence {

  public ArrayList<LinkedList<Integer>> allSequences(TreeNode root) {
    ArrayList<LinkedList<Integer>> results = new ArrayList<LinkedList<Integer>>();
    if(root==null) {
      results.add(new LinkedList<Integer>());
      return results;
    }

    int data = root.data;
    LinkedList<Integer> prefix = new LinkedList<Integer>();
    prefix.add(data);

    ArrayList<LinkedList<Integer>> leftSequences = allSequences(root.left);
    ArrayList<LinkedList<Integer>> rightSequences = allSequences(root.right);

    for(LinkedList<Integer> first: leftSequences) {
      for(LinkedList<Integer> second: rightSequences) {
        ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
        weaveLists(first, second, result, prefix);
        results.addAll(result);
      }
    }
    return results;
  }

  private void weaveLists(LinkedList<Integer> first,
      LinkedList<Integer> second, ArrayList<LinkedList<Integer>> result, LinkedList<Integer> prefix) {
    if(first.size()==0 || second.size()==0) {
      LinkedList<Integer> ans = (LinkedList<Integer>) prefix.clone();
      ans.addAll(first);
      ans.addAll(second);
      result.add(ans);
      return;
    }

    int headFirst = first.removeFirst();
    prefix.addLast(headFirst);
    weaveLists(first, second, result, prefix);
    prefix.removeLast();
    first.addFirst(headFirst);

    int headSecond = second.removeFirst();
    prefix.addLast(headSecond);
    weaveLists(first, second, result, prefix);
    prefix.removeLast();
    prefix.addFirst(headSecond);
  }

}
