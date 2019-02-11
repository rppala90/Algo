package com.ravi.Miscellaneous;

/*
 * Solve All Pairs shortest Path.
 *
 * Considering all nodes as intermediate nodes (k)
 * source as (i) and destination as (j)
 *
 * if dist[i][j] > dist[i][k]+disk[k][j];
 * then dist[i][j] = dist[i][k]+dist[k][j];
 */
public class FloydWarshall {

  public int[][] shortestPath(int[][] graph) {
    int num = graph.length;
    int[][] dist = new int[num][num];

    for(int i=0; i<num; i++)
      for(int j=0; j<num; j++)
        dist[i][j] = graph[i][j];

    for(int k=0; k<num; k++) {
      for(int i=0; i<num; i++) {
        for(int j=0; j<num; j++) {
          if(dist[i][j] > dist[i][k] + dist[k][j])
            dist[i][j] = dist[i][k] + dist[k][j];
        }
      }
    }

    return dist;
  }
}
