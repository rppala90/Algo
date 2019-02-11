package com.ravi.Miscellaneous;

import java.util.HashSet;

public class TripletsWithZero {

  public boolean findTriplets(int arr[] , int n) {
    for(int i=0; i<n; i++) {
      HashSet cache = new HashSet();
      for(int j=i+1; j<n;j++) {
        if(cache.contains(-1 * (arr[i] + arr[j]))) {
          return true;
        } else {
          cache.add(arr[j]);
        }
      }
    }
    return false;
  }

}