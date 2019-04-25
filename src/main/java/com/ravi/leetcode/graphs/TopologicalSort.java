package com.ravi.leetcode.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

  class Graph {
    HashMap<Integer, Node> allNodes = new HashMap<Integer, Node>();
  }

  class Node {
    int data;
    boolean visited;
    List<Node> neighbors = new LinkedList<Node>();
  }

  private String topologicalsort(Graph g) {
    Stack<Integer> output = new Stack<Integer>();
    for(Node n: g.allNodes.values()) {
        if(! n.visited) dfsTwist(n, output);
    }
    for(Node n: g.allNodes.values()) {
      n.visited = false;
    }
    String result = "";
    while(! output.isEmpty()) {
      result += output.pop();
    }
    return result;
  }

  private void dfsTwist(Node current, Stack<Integer> output) {
    for(Node neighbor: current.neighbors) {
      if(! neighbor.visited) dfsTwist(neighbor, output);
    }
    current.visited = true;
    output.push(current.data);
  }


  public String solution() {
    Graph g = new Graph();
    for(int i=1; i<=8; i++) {
      Node n = new Node();
      n.data = i;
      g.allNodes.put(i, n);
    }
    //Add Neighbors    1->4->7  1->5->8  1->6  2->3
    g.allNodes.get(1).neighbors.add(g.allNodes.get(4));
    g.allNodes.get(1).neighbors.add(g.allNodes.get(5));
    g.allNodes.get(1).neighbors.add(g.allNodes.get(6));
    g.allNodes.get(4).neighbors.add(g.allNodes.get(7));
    g.allNodes.get(5).neighbors.add(g.allNodes.get(8));
    g.allNodes.get(2).neighbors.add(g.allNodes.get(3));

    //Topological Sort
    return topologicalsort(g);
  }

  public static void main(String args[]) {
    TopologicalSort ts = new TopologicalSort();
    System.out.println(ts.solution());
  }

}
