package com.ravi.chapter4;

import java.util.LinkedList;

public class GraphNode {

  public String name;
  public boolean visited;
  public LinkedList<GraphNode> children = new LinkedList<GraphNode>();

}
