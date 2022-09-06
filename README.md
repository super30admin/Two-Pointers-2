# Two-Pointers-2

## Problem1: Remove duplicates from sorted array-2

```Java
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int removeDuplicates(int[] nums) {
        //null check
        if(nums == null || nums.length == 0)
            return 0;

        int count = 1;
        int slow = 1;

        for(int fast = 1;fast<nums.length;fast++){
            if(nums[fast] == nums[fast-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
```
## Problem2: Merge Sorted Array

```Java
// Time Complexity : O(1)
// Space Complexity : O(m+n)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1] >= nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }
            else{
                nums1[idx] = nums2[p2];
                p2--;

            }
            idx--;
        }
        while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}
```

## Problem3: Search in a 2D-Matrix-II

```Java
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i=0, j=n-1;

        while(i < m && j >=0){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] >= target)
                j--;

            else
                i++;
        }
        return false;
    }
}

```