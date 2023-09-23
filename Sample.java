                  // Merge Sorted Array

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left = m - 1;
        int right = n - 1;
        int index = m + n - 1;

        while(left >= 0 && right >= 0){
            if(nums2[right] > nums1[left]){
                nums1[index--] = nums2[right];
                right--;
            }
            else {
                nums1[index--] = nums1[left];
                left--;
            }
        }

        if(left < 0){
            for(int i = right;i>=0;i--)
                nums1[i] = nums2[i];
        }

    }
}

                  // Search a 2D Matrix II
// Time Complexity : O(m * n)  .. m, n : dimensions of array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes

class Solution {

    private boolean isValid(int[][] matrix, int row, int col){
        int m = matrix.length;
        int n = matrix[0].length;
        if(row >= 0 && row < m && col >= 0 && col < n)
            return true;
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while(isValid(matrix, i, j)){
            if(target == matrix[i][j])
                return true;
            else if(target > matrix[i][j])
                i++;
            else j--;
        }
        return false;
    }
}

                  // Remove Duplicates from sorted array II
// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Problems Faced : Couldn't even come up with a brute force solution. Watched lecture again and solved the question

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1])
                count++;
            else count = 1;

            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}

