// Problem 1 - Remove Duplicates from Sorted Array II
// Time Complexity : O(n) where n = length of array
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initialize index
// 2 - iterate through array
// 3 - check for 1st 2 elements or not more than 2 same elements
// 4 - return index
class Solution {
  public int removeDuplicates(int[] nums) {
    // 1
    int i = 0;
    // 2
    for (int num : nums) {
      // 3
      if (i < 2 || nums[i - 2] < num) {
        nums[i] = num;
        i++;
      }
    }
    
    // 4
    return i;
  }
}

// Problem 2 - Merge Sorted Array
// Time Complexity : O(n) where n = length of array nums1
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze pointers
// 2 - loop over nums1 from last
// 3 - check if iteration over nums2 done and break
// 4 - check if nums1 pointer is valid and if it is greater than nums2
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // 1
    int f = m - 1;
    int s = n - 1;
    // 2
    for (int i=m+n-1; i>=0; i--) {
      // 3
      if (s < 0) {
        break;
      }
      // 4
      if (f >= 0 && nums1[f] > nums2[s]) {
        nums1[i] = nums1[f];
        f--;
      } else {
        nums1[i] = nums2[s];
        s--;
      }
    }
  }
}

// Problem 3 - Search a 2D Matrix II
// Time Complexity : O(n + m)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initialize row index to last row and column to first
// 2 - loop over matrix
// 3 - if element found, return
// 4 - if current element greater than target, move row, else column
class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    
    // 1
    int row = matrix.length - 1;
    int column = 0;
    
    // 2
    while (row >= 0 && column < matrix[0].length) {
      // 3
      if (matrix[row][column] == target) {
        return true;
      } else if (matrix[row][column] > target) { // 4
        row--;
      } else {
        column++;
      }
    }

    return false;
  }
}
