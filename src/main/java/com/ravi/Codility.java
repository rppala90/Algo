package com.ravi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Codility {

  public int solution(String S) {
    int valErr =  validateInput(S);
    if(valErr != 0 && valErr != -3456) return valErr;
    if(valErr == -3456) {
      S = modifyS(S);
    }
    char[][] routeTable = getRouteTable(S);
    boolean[][] visited = new boolean[routeTable.length][routeTable[0].length];
    Member src = null, dst = null;

    for(int i=0; i<visited.length; i++) {
      for(int j=0; j<visited[0].length; j++) {
        if(routeTable[i][j] == 'O') { src = new Member(); src.setRow(i); src.setColumn(j); }
        if(routeTable[i][j] == 'T') { dst = new Member(); dst.setRow(i); dst.setColumn(j); }
        if(routeTable[i][j] == 'X') {visited[i][j] = true;}
      }
    }
    return findShortestDist(routeTable, visited, src, dst);
  }

  private String modifyS(String S) {
    StringTokenizer st = new StringTokenizer(S, ";");
    int numTok = st.countTokens();
    StringBuilder output = new StringBuilder();
    int lastLen = 0;
    for(int i=0; i<numTok; i++) {
      String currStr = st.nextToken();
      if(i==0)  { lastLen = currStr.length(); output.append(currStr); continue; }
      int currLen = currStr.length();
      if(lastLen - currLen > 0) {
          for(int k=0; k<lastLen-currLen; k++) {
            currStr += "_";
          }
      }
      output.append(currStr);
    }
    return output.toString();
  }

    private int validateInput(String S) {

      int firstO = S.indexOf('O');
      if(firstO == -1) return -1;
      if(S.indexOf('O', firstO+1) != -1) return -1;

      int firstX = S.indexOf('X');
      if (firstX == -1) return -1;
      if(S.indexOf('X', firstX + 1) != -1) return -1;


      StringTokenizer st = new StringTokenizer(S, ";");
      int numOfrows = st.countTokens();
      int numOfColumns = 0;
      if(st.hasMoreTokens()) {
        String firstRow = st.nextToken();
        numOfColumns = firstRow.toCharArray().length;
      }
      while(st.hasMoreTokens()) {
        if(numOfColumns != st.nextToken().toCharArray().length) return -3456;
      }
      return 0;
    }

  private int findShortestDist(char[][] routeTable, boolean[][] visited,
      Member src, Member dst) {
    Queue<Member> bstQueue = new LinkedList<Member>();
    bstQueue.add(src);
    src.setDistance(0);
    visited[src.row][src.column] = true;
    while(! bstQueue.isEmpty()) {
      Member current = bstQueue.remove();
      if(current.row == dst.row && current.column == dst.column) return current.distance;
      if(current.row - 1 >= 0 && visited[current.row-1][current.column] == false) {
        Member currMember = new Member();
        currMember.setRow(current.row-1);
        currMember.setColumn(current.column);
        currMember.setDistance(current.distance+1);
        bstQueue.add(currMember);
        visited[current.row-1][current.column] = true;
      }
      if(current.row + 1 < routeTable.length && visited[current.row+1][current.column] == false) {
        Member currMember = new Member();
        currMember.setRow(current.row+1);
        currMember.setColumn(current.column);
        currMember.setDistance(current.distance+1);
        bstQueue.add(currMember);
        visited[current.row+1][current.column] = true;
      }
      if(current.column -1 >= 0 && visited[current.row][current.column-1] == false) {
        Member currMember = new Member();
        currMember.setRow(current.row);
        currMember.setColumn(current.column-1);
        currMember.setDistance(current.distance+1);
        bstQueue.add(currMember);
        visited[current.row][current.column-1] = true;
      }
      if(current.column +1 < routeTable[0].length && visited[current.row][current.column+1] == false) {
        Member currMember = new Member();
        currMember.setRow(current.row);
        currMember.setColumn(current.column+1);
        currMember.setDistance(current.distance+1);
        bstQueue.add(currMember);
        visited[current.row][current.column+1] = true;
      }
    }
    return -1;
  }

  class Member {
    int row;
    int column;
    int distance;
    public void setRow(int row) { this.row = row;}
    public void setColumn(int column) { this.column = column;}
    public void setDistance(int distance) { this.distance = distance;}
  }

  private char[][] getRouteTable(String S) {
    StringTokenizer st = new StringTokenizer(S, ";");
    int numOfrows = st.countTokens();
    int numOfColumns = 0, i=0;
    char[][] inputRoute = null;
    if(st.hasMoreTokens()) {
      String firstRow = st.nextToken();
      numOfColumns = firstRow.toCharArray().length;
      inputRoute = new char[numOfrows][numOfColumns];
      inputRoute[i++] = firstRow.toCharArray();
    }
    while(st.hasMoreTokens()) {
      inputRoute[i++] = st.nextToken().toCharArray();
    }
    return inputRoute;
  }

  private void debugRouteTable(char[][] routeTable) {
    for(int i=0; i<routeTable.length; i++) {
      for(int j=0; j<routeTable[0].length; j++) {
        System.out.print(routeTable[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    Codility c = new Codility();
    System.out.println(c.solution("O__;_XT;___"));
  }

}
