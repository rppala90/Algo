package com.ravi.leetcode.facebook;

public class SearchRotatedArray {

  public int search(int[] nums, int target) {
    return search(nums, target, 0, nums.length-1);
  }

  private int search(int[] nums, int target, int start, int end) {
    if(end < start) return -1;
    if(target == nums[start]) return start;
    if(target == nums[end]) return end;
    if(start == end) {
      if(nums[start] == nums[end] && nums[end] == target) return start;
      else return -1;
    }
    int middle = (start + end) / 2;
    if(nums[start] < nums[middle]) {
      if(target >= nums[start] && target <= nums[middle]) {
        return search(nums, target, start, middle);
      } else {
        return search(nums, target, middle, end);
      }
    } else {
      if(target >= nums[start] || target <= nums[middle]) {
        return search(nums, target, start, middle);
      } else {
        return search(nums, target, middle, end);
      }
    }
  }

}
