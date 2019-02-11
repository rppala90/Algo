package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RouteBwNodesTest {

  RouteBwNodes rn = new RouteBwNodes();

  @Test
  public void routeTest() {
    Graph g = new Graph();
    for(int i=0; i<10; i++) {
      GraphNode gn = new GraphNode();
      gn.name = ""+i;
      if(i!=0) gn.children.add(g.nodes.get(i-1));
      g.nodes.add(gn);
    }

    GraphNode start = g.nodes.get(9);
    GraphNode end = g.nodes.get(4);

    assertEquals(true, rn.routeExists(start, end));
    assertEquals(false, rn.routeExists(end, start));
  }

}
