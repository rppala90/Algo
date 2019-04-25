package leetcode.Apr23.treegraph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RouteExists {

  static class TreeNode {
    int val;
    List<TreeNode> neighbors = new LinkedList<TreeNode>();
    TreeNode(int val) { this.val = val;}
  }

  private boolean doesRouteExist(TreeNode n1, TreeNode n2) {
    Queue<TreeNode> currentLayer = new LinkedList<TreeNode>();
    currentLayer.add(n1);
    HashSet<TreeNode> allNodesSoFar = new HashSet<TreeNode>();
    allNodesSoFar.add(n1);
    while(! currentLayer.isEmpty()) {
        TreeNode node = currentLayer.remove();
        for(TreeNode neighbor: node.neighbors) {
          if(! allNodesSoFar.contains(neighbor)) {
            allNodesSoFar.add(neighbor);
            currentLayer.add(neighbor);
          }
        }
      if(allNodesSoFar.contains(n2)) return true;

    }
    return false;
  }

  public static void main(String[] args) {
    RouteExists rs = new RouteExists();
    TreeNode n1 = new TreeNode(1);
    n1.neighbors.add(new TreeNode(2));
    n1.neighbors.add(new TreeNode(3));
    n1.neighbors.add(new TreeNode(4));
    TreeNode n2 = new TreeNode(5);
    n1.neighbors.get(2).neighbors.add(n2);
    System.out.println(String.format("Route exists between %s and %s ? %s", n1.val, n2.val, rs.doesRouteExist(n1, n2)));
  }

}
