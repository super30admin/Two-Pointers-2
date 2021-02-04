
// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
//binary search each row

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++){

            int start = matrix[i][0];
            int end = matrix[i][matrix[i].length-1];

            if(target>=start && target<=end && binarySearch(matrix[i],target)) //check if in range
                return true;
        }

        return false;
    }

    public boolean binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid])
                start = mid+1;
            else if(target<nums[mid])
                end = mid-1;
            else
                return true;
        }

        return false;
    }
}