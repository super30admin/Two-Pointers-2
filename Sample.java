
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 1;
        int count = 1;
        
        for(int i = 1 ; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
                
            }
            
        }
        return j;
    }
}


// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return;
        }
        
        int pointer1 = m-1;
        int pointer2 = n-1;
        int index = m + n - 1;
        
        while(pointer1 >= 0 && pointer2 >=0) {
            if(nums1[pointer1] > nums2[pointer2]) {
                nums1[index] = nums1[pointer1];
                pointer1--;
                index--;
            } else {
                nums1[index] = nums2[pointer2];
                pointer2--;
                index--;
            }
        }
        
        while(pointer2 >= 0) {
            nums1[index] = nums2[pointer2];
            pointer2--;
            index--;
        }
        
        
    }
}


// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int column = n-1;
        
        while(row < m & column >=0) {
            if(matrix[row][column] > target) {
                column--;
            } else if(matrix[row][column] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
