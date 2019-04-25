import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class ProjectDependencies {

  Graph g = new Graph();

  class Graph{
    HashMap<Character, Node> allProj = new HashMap<Character, Node>();
    HashMap<Node, List<Node>> dependencies = new HashMap<Node, List<Node>>();
  }

  class Node{
    Character data;
    boolean visited;
    public Node(char c) { this.data = c; }
  }

  private void printGraph() {
    System.out.println("All Nodes :");
    for(Node n: g.allProj.values()) {
      System.out.print(n.data + " ");
    }
    System.out.println("\nAll Dependencies");
    for(Entry<Node, List<Node>> entry: g.dependencies.entrySet()) {
      System.out.print(entry.getKey().data+ "-->");
      for(Node n: entry.getValue()) {
        System.out.print(n.data+" ");
      }
      System.out.println();
    }
  }

  private void addProject(char c) {
    if(g.allProj.containsKey(c)) {
      System.out.println("Already contains node c");
    } else {
      Node n = new Node(c);
      g.allProj.put(c, n);
    }
  }

  private void addDependency(char src, char dest) {
      if(g.allProj.containsKey(src) && g.allProj.containsKey(dest)) {
        Node s = g.allProj.get(src);
        Node d = g.allProj.get(dest);
        if(g.dependencies.containsKey(d)) {
          g.dependencies.get(d).add(s);
        } else {
          List<Node> temp = new LinkedList<Node>();
          temp.add(s);
          g.dependencies.put(d, temp);
        }
      } else {
        System.out.printf("One of the src %s or dest %s is missing\n", src, dest);
      }
  }

  private void removeProject(char delMe) {
    Node delNode = g.allProj.get(delMe);
    List<Node> deleteKeys = new LinkedList<Node>();
    for(Node key: g.dependencies.keySet()) {
      if(g.dependencies.get(key).contains(delNode)) {
        g.dependencies.get(key).remove(delNode);
      }
      if(g.dependencies.get(key).isEmpty()) { deleteKeys.add(key);}
    }
    for(Node key: deleteKeys) g.dependencies.remove(key);
    g.allProj.remove(delMe, delNode);
  }


  public static void main(String args[]) {
    ProjectDependencies pd = new ProjectDependencies();
    pd.addProject('a');
    pd.addProject('b');
    pd.addProject('c');
    pd.addProject('d');
    pd.addProject('e');
    pd.addProject('f');
    pd.addProject('g');
    pd.addDependency('a', 'b');  // A depends on B (or) B can not be deleted before A.
    pd.addDependency('a', 'c');
    pd.addDependency('b', 'd');
    pd.addDependency('e', 'f');
    pd.addDependency('f', 'c');
    pd.removeProject('a');
    pd.removeProject('e');
    pd.removeProject('b');
    pd.removeProject('c');
    pd.removeProject('f');
    pd.removeProject('c');
    pd.removeProject('d');
    pd.removeProject('g');
    pd.printGraph();
  }

}
