
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int slow = 1;
        int count = 1;
        for(int i=1; i< nums.length; i++) {
            if(nums[i] == nums[i-1]) count++;
            else count = 1;
            if(count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}


// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null) return;
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        
        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1]  <= nums2[p2]) {
                nums1[idx] = nums2[p2];
                p2--;
            }
            else {
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }
        while(p2 >= 0) {
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = m-1; int j = 0;
        while(i >= 0 && j < n) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target) 
                i--;
            else j++;  
        }
        return false;
    }
}