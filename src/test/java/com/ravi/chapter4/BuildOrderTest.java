package com.ravi.chapter4;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import org.junit.Test;

public class BuildOrderTest {

  BuildOrder bo = new BuildOrder();

  @Test
  public void buildOrderTest() {
    String[] input = {"f", "b", "a", "d", "c"};
    BuildOrder.GraphNode[] nodes = new BuildOrder.GraphNode[input.length];
    for(int i=0; i<input.length; i++) {
      nodes[i] = bo.new GraphNode();
      nodes[i].name = input[i];
    }
    nodes[0].children.add(nodes[1]);
    nodes[0].children.add(nodes[2]);
    nodes[1].dependencies++;
    nodes[2].dependencies++;
    nodes[2].children.add(nodes[3]);
    nodes[3].dependencies++;

    BuildOrder.Graph graph = bo.new Graph();
    for(int i=0; i<nodes.length; i++) {
      graph.nodes.add(nodes[i]);
    }

    LinkedList<BuildOrder.GraphNode> order = bo.getBuildOrder(graph);
    StringBuilder buildOrder =  new StringBuilder();
    order.forEach((x)-> buildOrder.append(x.name));

    assertEquals("bad", buildOrder.toString().substring(2));

  }

}
