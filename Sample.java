// remove duplicates from sorted array
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        
        int count = 1;
        
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        
        return j;
    }
}

// remove duplicates from sorted array
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        
        while(i>=0 && j >= 0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}

// remove duplicates from sorted array
// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        
        while(row<matrix.length && column>=0){
            
            if(matrix[row][column]>target){
                column--;
            }
            else if(matrix[row][column]<target){
                row++;
            }
            else
                return true;
            
        }
        return false;
    }
}

