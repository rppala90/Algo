package com.ravi.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class WordLadder2 {

  class Node {
    boolean visited;
    boolean processed;
    String data;
    Node(String data) { this.data = data;}
  }

  class Graph {
    HashMap<String, Node> allNodes = new HashMap<String, Node>();
    HashMap<Node, List<Node>> neighbors = new HashMap<Node, List<Node>>();
  }

  private List<String> getNeighbor(String word, String[] wordList) {
    List<String> neighbors = new LinkedList<String>();
    for(String currWord : wordList) {
      if(currWord.equals(word)) continue;
      boolean currWordIsNeighbor = true;
      boolean tolerateDiff = true;
      for(int i=0; i<currWord.length(); i++) {
        if(currWord.charAt(i) != word.charAt(i)) {
          if(tolerateDiff) { tolerateDiff = false; continue; }
          else {
            currWordIsNeighbor = false; break; }
        }
      }
      if(currWordIsNeighbor) neighbors.add(currWord);
    }
    return neighbors;
  }

  private void printallNeighbors(Graph g) {
    for(Node key: g.neighbors.keySet()) {
      System.out.print(key.data + " --> ");
      for(Node value:g.neighbors.get(key)) {
        System.out.print(value.data+ " ");
      }
      System.out.println();
    }
  }

  private Graph buildGraph(String beginWord, String[] wordList) {
    Graph g = new Graph();
    Node begin = new Node(beginWord);
    g.allNodes.put(beginWord, begin);
    g.neighbors.put(g.allNodes.get(beginWord), new LinkedList<Node>());

    for(String word: wordList) {
      Node node = new Node(word);
      g.allNodes.put(word, node);
      g.neighbors.put(g.allNodes.get(word), new LinkedList<Node>());
    }


    for(String word: g.allNodes.keySet()) {
      List<String> neighborStrings = getNeighbor(word, wordList);
      for(String neighbor: neighborStrings) {
        g.neighbors.get(g.allNodes.get(word)).add(g.allNodes.get(neighbor));
      }
    }
    return g;
  }

  private List<String> solution(String beginWord, String endWord, String[] wordList) {
    Graph g = buildGraph(beginWord, wordList);
    printallNeighbors(g);
    return calldfsSearch(g, beginWord, endWord);
  }

  private List<String> calldfsSearch(Graph g, String beginWord, String endWord) {
    Node beginNode = g.allNodes.get(beginWord);
    Node endNode = g.allNodes.get(endWord);
    List<String> answer = new LinkedList<String>();
    Queue<String> path = new LinkedList<String>();

    int count = 1;
    while(!beginNode.processed) {
      beginNode.visited = true;
      path.add(beginNode.data);
      dfsSearch(g, beginNode, endNode, path);
      for(Node n: g.allNodes.values()) {
        if(! n.processed) n.visited = false;
      }
      String output = "";
      if(! path.contains(endNode.data)) continue;
      while(! path.isEmpty()) {
        output += path.remove();
      }
      answer.add(output);
    }
    for(String s: answer) {
      System.out.println(s);
    }
    return answer;
  }

  private void dfsSearch(Graph g, Node begin, Node end, Queue path) {
    if(begin == null || begin.processed) return;
    if(! begin.visited) path.add(begin.data);
    begin.visited = true;
    for(Node neighbor: g.neighbors.get(begin)) {
      if(! path.contains(end.data) && neighbor.data == end.data) {
        path.add(end.data); begin.processed = true; return;
      }
      if(! neighbor.visited) { dfsSearch(g, neighbor, end, path);}
    }
    if(! path.contains(end.data)) { path.remove(begin.data); begin.processed = true;}
  }

  public static void main(String args[]) {
    String beginWord = "hit";
    //String endWord = "cot";
    //String[] wordList = {"hot", "cot"};
    String endWord = "cog";
    String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
    WordLadder2 wl = new WordLadder2();
    wl.solution(beginWord, endWord, wordList);
  }

}
