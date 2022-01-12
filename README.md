# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int count=0;
        while( j < nums.length)
        {
            if(nums[j] == nums[j-1])
            {
                count++;
            }
            else
            {
                count =0;
            }
            
            if(count <2)
            {
                nums[i] = nums[j];
                i++;
            }
            
            
            j++;
        }
        
        
        return i;
    }
}

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
// Time Complexity : O(M + N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        
        
        for (int p = m + n - 1; p >= 0 && p2 >=0; p--) {
        
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {// nums1[p1] > nums2[p2] reverse order : biggest first!!!
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }
}


## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Time Complexity : O(M + N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if( matrix == null || matrix.length == 0)
       {
           return false;
       }
        
        //iterate over the matrix diagonals 
        int m = matrix.length ;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n-1;
        
        while(row < m && col >=0)
        {
            int element = matrix[row][col];
            
            if( element< target)
            {
                row++;
            }
            else if ( element> target)
            {
                col--;
            }
            else
            {
                return true;
            }
        }
        
        return false;
    }

