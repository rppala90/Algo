package com.ravi.leetcode.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

public class BuildGraphFrom2DArray {

  /*
      BIG ASSUMPTION IF USING ONLY HASHMAP IS THAT THE KEYS WILL ALL BE UNIQUE.
   */
  static int ROWSIZE = 0, COLUMNSIZE = 0;
  Graph graph = new Graph();

  public static void main(String args[]) {

    int[][] inputMatrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
    ROWSIZE = inputMatrix.length;
    COLUMNSIZE = inputMatrix[0].length;

    BuildGraphFrom2DArray buildGraphFrom2DArray = new BuildGraphFrom2DArray();
    buildGraphFrom2DArray.buildGraph(inputMatrix);
    buildGraphFrom2DArray.dfsPrintGraph();
    buildGraphFrom2DArray.bfsPrintGraph();
  }

  private void bfsPrintGraph() {
    /* Set visited to false */
    HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
    for(Integer key: graph.nodes) {
      visited.put(key, false);
    }
    System.out.println();
    for(Integer node: graph.nodes) {
      bfsPrintHelper(node, visited);
    }
    System.out.println();
  }

  private void bfsPrintHelper(int node, HashMap<Integer, Boolean> visited) {
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(node);
    while(! q.isEmpty()) {
      int current = q.remove();
      if(visited.get(current)) continue;
      visited.put(current, true);
      System.out.print(current + " ");
      for(int nextNode: graph.elements.get(current)) {
        q.add(nextNode);
      }
    }
  }

  private void dfsPrintGraph() {
    /* Set visited to false */
    HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
     for(Integer key: graph.nodes) {
         visited.put(key, false);
     }
    System.out.println();
    for(Integer node: graph.nodes) {
      dfsPrintHelper(node, visited);
    }
    System.out.println();

  }

  private void dfsPrintHelper(int node, HashMap<Integer, Boolean> visited) {
      if(! visited.get(node)) {
        System.out.print(node + " ");
        visited.put(node, true);
        for(Integer neighbor: graph.elements.get(node)) {
          dfsPrintHelper(neighbor, visited);
        }
      }
  }

  /*
        0
      3 X 1
        2
   */
  private Point[] getNeighbors(int row, int column) {
    Point[] neighbors = new Point[4];
    neighbors[0] = (row == 0) ? null: new Point(row-1, column);
    neighbors[1] = (column == COLUMNSIZE-1) ? null: new Point(row, column+1);
    neighbors[2] = (row == ROWSIZE-1) ? null: new Point(row+1, column);
    neighbors[0] = (column == 0) ? null: new Point(row, column-1);
    return neighbors;
  }

  private void initializeGraph(int[][] inputMatrix) {
    for (int row = 0; row < ROWSIZE; row++) {
      for (int column = 0; column < COLUMNSIZE; column++) {
        int current = inputMatrix[row][column];
        graph.nodes.add(current);
        graph.elements.put(current, new LinkedList<Integer>());
        System.out.print(" "+ current + " ");
      }
    }
  }

  class Graph{
    HashMap<Integer, List<Integer>> elements;
    HashSet<Integer> nodes;

    Graph() {
      elements = new HashMap<Integer, List<Integer>>();
      nodes = new HashSet<Integer>();
    }

  }

  class Point{
    int row;
    int column;
    Point(int row, int column) { this.row = row; this.column = column;}
  }

  private void buildGraph(int[][] inputMatrix) {
      initializeGraph(inputMatrix);
      for(int row=0; row<ROWSIZE; row++) {
        for(int column=0; column<COLUMNSIZE; column++) {
          int current = inputMatrix[row][column];
          Point[] neighbors = getNeighbors(row, column);
          for(Point neighbor: neighbors) {
            if(neighbor == null) continue;
            graph.elements.get(current).add(inputMatrix[neighbor.row][neighbor.column]);
          }
        }
      }
  }
}
