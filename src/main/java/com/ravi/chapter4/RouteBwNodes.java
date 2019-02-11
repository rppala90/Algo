package com.ravi.chapter4;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBwNodes {

  public boolean routeExists(GraphNode node1, GraphNode node2) {
    Queue<GraphNode> q = new LinkedList<GraphNode>();
    q.add(node1);
    while(! q.isEmpty()) {
      GraphNode current = q.remove();
      if(current == node2) return true;
      current.visited = true;
      current.children.forEach((x) -> { if(! x.visited) q.add(x); });
    }
    return false;
  }

}
