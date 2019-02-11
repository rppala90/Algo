package com.ravi.Miscellaneous;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
 *  Even though this approach works. This is not good time complexity wise.
 *  There is an excellent solution for this using Tries under
 *  https://leetcode.com/problems/word-search-ii/discuss/59780/Java-15ms-Easiest-Solution-(100.00)
 */
public class WordSearch2 {

  class GraphNode {
    char val;
    List<GraphNode> children = new LinkedList<GraphNode>();
    boolean isVisited = false;
  }

  HashMap<String, GraphNode> map = new HashMap<String, GraphNode>();

  public List<String> findWords(char[][] matrix, String[] words) {

    // Populate Graph from board
    // dfs of string in graph.
    int rows = matrix.length;
    int columns = matrix[0].length;
    for(int i=0; i<rows; i++) {
      for(int j=0; j<columns; j++) {
        GraphNode current = new GraphNode();
        current.val = matrix[i][j];
        map.put(i+"-"+j, current);
      }
    }

    for(int i=0; i<rows; i++) {
      for(int j=0; j<columns; j++) {
        //East : i, j+1    West : i, j-1
        //North : i-1, j   South : i+1, j
        if(j+1>=0 && j+1 < columns) map.get(i+"-"+j).children.add(map.get(i+"-"+(j+1)));
        if(j-1>=0 && j-1 < columns) map.get(i+"-"+j).children.add(map.get(i+"-"+(j-1)));
        if(i-1>=0 && i-1 < rows) map.get(i+"-"+j).children.add(map.get((i-1)+"-"+j));
        if(i+1>=0 && i+1 < rows) map.get(i+"-"+j).children.add(map.get((i+1)+"-"+j));
      }
    }

    //printMatrixForVerificationAlongWithChildren();
    List<String> output = new LinkedList<String>();
    for(String input: words) {
      if(output.contains(input)) continue;
      for(GraphNode node: map.values()) {
        resetisVisited();
        if(dfs(node, input)) {
          output.add(input);
          break;
        }
      }
      resetisVisited();
    }
    return output;
  }

  public boolean dfs(GraphNode node, String input) {
    node.isVisited = true;
    //System.out.println(input.length());
    //System.out.println(node.val);
    if(input.length() == 0) return true;
    if(input.length()== 1 && node.val == input.charAt(0)) {
      return true;
    };
    if(node.val == input.charAt(0)) {
      for(GraphNode childNode : node.children) {
        if(childNode.isVisited == false ) {
          if( dfs(childNode, input.substring(1))) {
            return true;
          } else {
            childNode.isVisited = false;
          }
        }
      }
    }
    return false;
  }

  private void printMatrixForVerificationAlongWithChildren () {
    map.forEach((k, v) -> {
      System.out.print(v.val + " Children : ");
      v.children.forEach((c) -> {
        System.out.print(" " + c.val);
      });
      System.out.println();
    });
  }

  private void resetisVisited() {
    map.forEach((k,v) -> v.isVisited=false);
  }
}
