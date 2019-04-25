package com.ravi.leetcode.graphs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BuildGraphFrom2DArrayNoHash {

  /*
   * This graph will simply be a list of all nodes present in the graph.
   * Iam writing this to differentiate between graph using hashmap,hashset and list of nodes.
   */

  class Node {
    int data;
    boolean visited;
    List<Node> neighbors = new LinkedList<Node>();
    Node(int data) { this.data = data;}
  }

  class Graph {
    HashMap<Integer, Node> allNodesInGraph = new HashMap<Integer, Node>();
  }

  public static void main(String args[]) {
    BuildGraphFrom2DArrayNoHash bg = new BuildGraphFrom2DArrayNoHash();
    bg.solution();
  }

  private void solution() {
    int[][] input = {{1,2,3}, {4,5,6},{7,8,9}};
    Graph g = new Graph();
    buildGraph(input, g);
    dfs(g.allNodesInGraph.values());
    System.out.println();
    bfs(g.allNodesInGraph.values());
  }

  private void dfs(Collection<Node> allNodes) {
    for(Node n: allNodes) {
      if(! n.visited) dfsHelper(n);
    }
    for(Node n: allNodes) {
      n.visited = false;
    }
  }

  private void dfsHelper(Node n) {
    System.out.print(" " + n.data + " ");
    n.visited = true;
    for(Node neighbor: n.neighbors) { if(! neighbor.visited) {dfsHelper(neighbor);} }
  }

  private void bfs(Collection<Node> allNodes) {
    for(Node n:allNodes) {
      if(!n.visited) bfsHelper(n);
    }
    for(Node n: allNodes) {
      n.visited = false;
    }
  }

  private void bfsHelper(Node n) {
    Queue<Node> level = new LinkedList<Node>();
    level.add(n);
    while(! level.isEmpty()) {
      Node current = level.remove();
      if(current.visited)  continue;
      System.out.print(" " + current.data + " ");
      current.visited = true;
      for(Node neighbor: current.neighbors) { if(! neighbor.visited) level.add(neighbor); }
    }
  }

  /*          0
   *       3  X  1
   *          2
   */
  private List<Node> getNeighbors(int row, int column, Graph g, int[][] input) {
    List<Node> neighbors = new LinkedList<Node>();
    if(row > 0)   neighbors.add(g.allNodesInGraph.get(input[row-1][column]));
    if(column < input[0].length-1) neighbors.add(g.allNodesInGraph.get(input[row][column+1]));
    if(row < input.length-1) neighbors.add(g.allNodesInGraph.get(input[row+1][column]));
    if(column > 0) neighbors.add(g.allNodesInGraph.get(input[row][column-1]));
    return neighbors;
  }

  private void buildGraph(int[][] input, Graph g) {
    for(int i=0; i<input.length; i++) {
      for(int j=0; j<input[0].length; j++) {
        g.allNodesInGraph.put(input[i][j], new Node(input[i][j]));
      }
    }
    for(int row=0; row<input.length; row++) {
      for(int column=0; column<input[0].length; column++) {
        g.allNodesInGraph.get(input[row][column]).neighbors.addAll(getNeighbors(row, column, g, input));
      }
    }
  }

}
