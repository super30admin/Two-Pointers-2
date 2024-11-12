# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
## Solution 1
## Time Complexity:O(N) Space Complexity:O(1)
## We store the slow and fast pointer the fast pointer is used to check the new element and its count is stored.
## If the count is less than k it is stored in the slow pointers position and incremented accordingly.


class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int fast=0;
        int slow=0;
        int k=2;
        int count=0;
        while(fast<n)
        {
            if(fast>0 && nums[fast]==nums[fast-1])
            { 
             count++;

            }
            else count=1;

            if(count<=k)
            {
                nums[slow]=nums[fast];
                slow++;

            }
            fast++;
        }
        return slow;
    }    
}

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
## Time Complexity:O(m+n) Space Complexity:O(1)
## Here we point to the maximum of two elements find the greater ones and store it in the last index of bigger array nums1 and decrement all pointers
## Once on of the pointers reach 0 the remaining elements are just printed as it is.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=m+n-1;
        int p1=m-1;
        int p2=n-1;
        while(p1>=0 && p2>=0){
        if(nums1[p1]>nums2[p2])
        {
           nums1[idx]=nums1[p1];
           p1--;
        }else{
            nums1[idx]=nums2[p2];
            p2--;
        }
        idx--;

        }

        while(p2>=0)
        {
            nums1[idx]=nums2[p2];
            p2--;
            idx--;
        }

    }
}
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
## Solution 3
## Time Complexity:O(m+n) Space Complexity:O(1)
## Here instead of traversing all elements we have found the right path to traverse.
## Every element is compared with its next or greater element and accordingly column pointer is incremented and row decremented, since we begin from below.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length-1;
        int c=0;
        
        while(r>=0 && c<matrix[0].length )
        {
            if(matrix[r][c]<target)
            {
                c++;
            }
            else if(matrix[r][c]>target)
            {
                r--;
            }
            else
            return true;
        }
        return false;
        
    }
}
