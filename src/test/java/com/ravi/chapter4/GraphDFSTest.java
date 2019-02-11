package com.ravi.chapter4;

import org.junit.Test;

public class GraphDFSTest {

  Graph g = new Graph();
  @Test
  public void graphTest() {
    for(int i=0; i<10; i++) {
      GraphNode gn = new GraphNode();
      gn.name = ""+i;
      if(i!=0) gn.children.add(g.nodes.get(i-1));
      g.nodes.add(gn);
    }

    GraphDFS dfs = new GraphDFS();
    dfs.dfs(g.nodes.getLast());
    System.out.println();
    g.nodes.forEach((x) -> x.visited=false);
    GraphBFS bfs = new GraphBFS();
    bfs.bfs(g.nodes.getLast());
    System.out.println();
  }

}
