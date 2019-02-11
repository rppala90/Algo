package com.ravi.chapter8;

import java.util.Calendar;
import java.util.HashMap;

public class Fibonacci {

  HashMap<Integer, Long> cache;

  public Fibonacci() {
    cache = new HashMap();
  }

  public static void main(String args[]) {
    Fibonacci f = new Fibonacci();
    int n = 50;
    long b4 = getMillis();
    long ans = f.normal(n);
    long after = getMillis();
    System.out.println(String.format("Time taken for getting %d th "
        + "fibonacci as %d is %.2f", n, ans, inMillis(b4, after)));
    b4 = getMillis();
    ans = f.Memoiz(n);
    after = getMillis();
    System.out.println(String.format("Time taken for getting %d th "
        + "fibonacci using memoiz as %d is %.2f", n, ans, inMillis(b4, after)));
    b4 = getMillis();
    ans = f.recur(n);
    after = getMillis();
    System.out.println(String.format("Time taken for getting %d th "
        + "fibonacci using recur as %d is %.2f", n, ans, inMillis(b4, after)));

  }

  private static long getMillis() {
    return Calendar.getInstance().getTimeInMillis();
  }

  private static double inMillis(long b4, long after) {
    return after - b4;
  }

  private long normal(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    return normal(n-1) + normal(n-2);
  }

  private long Memoiz(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    long ans = cache.containsKey(n) ? cache.get(n): 0;
    if(ans == 0) {
      ans = Memoiz(n-1) + Memoiz(n-2);
      cache.put(n, ans);
    }
    return ans;
  }

  private long recur(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    long a = 0;
    long b = 1;
    for(int i=2; i<n; i++) {
      long c = a + b;
      a = b;
      b = c;
    }
    return a + b;
  }

}
