
// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0; 
        int j = n - 1;
        //top right
        while(i<m && j>=0){
            //base
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target){
                //search the same row
                j--;
            } else {
                //less than target, check the next row
                i++;
            }
        }
        return false;
    }
}


// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(null == nums1 || null == nums2) return;
        
        int i = m-1;
        int j = n-1;
        int idx = m + n -1;
        while(i >=0 && j>=0 ){
            if(nums2[j] >= nums1[i]){
                nums1[idx] = nums2[j];
                j--;
                idx--;
            } else {
                nums1[idx] = nums1[i];
                idx--;
                i--;
            }
        }
        
        while(j>=0){
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
        
        while(i>=0){
            nums1[idx] = nums1[i];
            i--;
            idx--;
        }
        
    }
}
