package com.ravi.chapter4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class BuildOrder {

  class GraphNode {
    String name;
    LinkedList<GraphNode> children = new LinkedList<GraphNode>();
    int dependencies;
    boolean visited;
  }

  class Graph {
    LinkedList<GraphNode> nodes = new LinkedList<GraphNode>();
  }

  /* Modifies the Graph */
  public LinkedList<GraphNode> getBuildOrder(Graph g) {
    LinkedList<GraphNode> output = new LinkedList<GraphNode>();
    Queue<GraphNode> q = new LinkedList<GraphNode>();
    g.nodes.forEach((x)->{
      if(x.dependencies==0) {
        q.add(x);
      }
    });
    while(! q.isEmpty()) {
      GraphNode current = q.remove();
      output.add(current);
      current.children.forEach((x) -> {
            x.dependencies--;
            if(x.dependencies==0) {
              q.add(x);
            }
      });
    }
    return output;
  }

}