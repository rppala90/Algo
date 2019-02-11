package com.ravi.Miscellaneous;

import java.util.Arrays;
import java.util.Collections;

/*
 * Sort two arrays in knapsack algorithm by value per unit.
 * One array is weights, another is values.
 * Item numbers dictated by the array indexes.
 */
public class SortArrays {

  private Item[] items;

  public SortArrays(int[] weights, int[] prices) {
    assert weights.length == prices.length;
    items = new Item[weights.length];
    for(int i=0; i<weights.length; i++) {
      items[i] = new Item(i, weights[i], prices[i]);
    }
  }

  public void basedOnPricePerUnit() {
    Arrays.sort(items, Collections.reverseOrder());
  }

  public Item[] getItems() {
    return items;
  }

  class Item implements Comparable<Item>{
    int number, weight, price;

    Item(int number, int weight, int price) {
      this.number = number;
      this.weight = weight;
      this.price = price;
    }

    @Override
    public int compareTo(Item o) {
      double ppu = this.price / this.weight;
      double Othersppu = o.price / o.weight;
      if(ppu < Othersppu)  return -1;
      else if (ppu > Othersppu) return 1;
      return 0;
    }

  }
}
