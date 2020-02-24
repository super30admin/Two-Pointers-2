
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


// Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
class Solution {
    // Time complexity - O(n)
    // Space Complexity - O(1);
    public int removeDuplicates(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0)
            return 0;
        //
        // Initialize the counter and the second pointer.
        //
        int j = 1, count = 1;
        
        //
        // Start from the second element of the array and process
        // elements one by one.
        //
        for (int i = 1; i < nums.length; i++) {
            
            //
            // If the current element is a duplicate, increment the count.
            //
            if (nums[i] == nums[i - 1]) {
                
                count++;
                
            } else {
                
                //
                // Reset the count since we encountered a different element
                // than the previous one.
                //
                count = 1;
            }
            
            //
            // For a count <= 2, we copy the element over thus
            // overwriting the element at index "j" in the array
            //
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
        
    }
}

// Problem2 (https://leetcode.com/problems/merge-sorted-array/)
class Solution {
    // Time complexity - O(n)
    // Space complexity - O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //edge case
        if(m == 0 && n == 0) return ;
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        // Step 1: add the largest element at the end of nums 1
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i];
                i--;
            }else{
                nums1[k--] = nums2[j];
                j--;
            }
        }
        
        // or Step 2: add rest of the elements from nums1
        while(i >= 0){
            nums1[k--] = nums1[i];
                i--;
        }
        // or Step 2: add rest of the elements from nums2
        while(j >= 0){
            nums1[k--] = nums2[j];
                j--;
        }
        
    }
}

// Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
class Solution {
    // Time complexity - O(n + m) where m - num of rows and n - num of cols
    // Space complexity - O(1)
    
    public boolean searchMatrix(int[][] matrix, int target) {
        // edge case
        if(matrix == null || matrix.length == 0){
            return false;
        }
        
        //Step 1: choose left bottom or top right as the starting point
        // we choose left bottom as starting point: row-- value decreases, col++ val . increases
        int row = matrix.length - 1, col = 0;
        
        while(row >= 0 && col < matrix[0].length){
            if(target == matrix[row][col]){
                return true;
            }else if(target < matrix[row][col]){
                //decrement row to go to a smaller value than curr value
                row--;
            }else{
                //increment col to go to a higher value than curr value
                col++;
            }
        }
        //if target is not found
        return false;
    }
}