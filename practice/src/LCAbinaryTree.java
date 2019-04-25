import java.util.LinkedList;
import java.util.Queue;

public class LCAbinaryTree {


  private Node[] buildBinaryTree(int[] input) {
    Node[] allNodes = new Node[input.length];

    for(int i=0; i<input.length; i++) {
      allNodes[i] = new Node(input[i]);
    }
    for(int i=0; i<input.length; i++) {
      if((2*i+1) < input.length) allNodes[i].left = allNodes[2*i+1];
      if((2*i+2) < input.length) allNodes[i].right = allNodes[2*i+2];
    }
    System.out.println("Printing tree");
    //printInOrderTree(allNodes[0]);
    return allNodes;
  }

  private void printInOrderTree(Node root) {
    if(root == null) return;
    System.out.print(" " + root.data + " ");
    printInOrderTree(root.left);
    printInOrderTree(root.right);
  }

  // O(n^2)
  private Node findCommonAncestor_solnpow2(Node root, Node first, Node second) {
    if(root == null || first == root || second == root) return root;
    boolean first_isleft = findNode(root.left, first);
    boolean second_isleft = findNode(root.left, second);
    if(first_isleft == second_isleft) return findCommonAncestor_solnpow2(root.left, first, second);
    return root;
  }

  private Node findCommonAncestor(Node root, Node first, Node second) {
    if(root == null) return null;
    Node left_node = findCommonAncestor(root.left, first, second);
    Node right_node = findCommonAncestor(root.right, first, second);
    if(left_node != null && right_node != null) return root;
    else if(root == first || root == second) {
      return root;
    } else {
      return left_node == null ? right_node : left_node;
    }
  }

  private boolean findNode(Node root, Node dest) {
    if(root == dest) return true;
    if(root == null || dest == null) return false;
    boolean found = findNode(root.left, dest);
    if(! found)
      found = findNode(root.right, dest);
    return found;
  }

  private int solution() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Node[] allNodes = buildBinaryTree(input);
    return findCommonAncestor(allNodes[0], allNodes[1], allNodes[4]).data;
  }

  public static void main(String args[]) {
    LCAbinaryTree lt = new LCAbinaryTree();
    System.out.println(lt.solution());

  }

  class Node {
    int data;
    Node left;
    Node right;
    Node(int data) { this.data = data;}
  }

}
