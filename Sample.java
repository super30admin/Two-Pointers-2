// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int slow = 0;
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(i==0 || nums[i] !=nums[i-1]){
                count = 1;
            }else{
                count = count + 1;
            }
            if(count<=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}


// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach

// ## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;
        int p1 = m-1;
        int p2 = n-1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
                index--;
            }else{
                nums1[index] = nums2[p2];
                p2--;
                index--;
            }
        }
        while(p2 >= 0){
            nums1[index] = nums2[p2];
            index--;
            p2--;
        }
    }
}


// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
//## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int i=0;
        int j = c-1;
        while(i< r && j>=0){
            if(matrix[i][j] == target){
                return true;
            }else{
                if(matrix[i][j] > target){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return false;
    }
}