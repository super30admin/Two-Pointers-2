import java.util.*;

//Time Complexity : O(nlogn)
//Space Complexity : O(n) n = number of elements in a row
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if( matrix == null || matrix.length == 0 || matrix[0].length == 0)   return false;

        for(int i = 0;i < matrix.length ; i++){

            //checks whether target lies in that row
            if( target >= matrix[i][0] &&
               target <= matrix[i][matrix[0].length - 1]){

                int nums[] = new int[matrix[0].length];

                //enter the elements of that row in an 1-D array
                for(int j = 0; j < matrix[0].length; j++){
                    nums[j] = matrix[i][j];
                }
                //binary search algorithm to search target
                int value = binarySearch(nums , target);
                if(value == target) return true;  //if target found in 2-D matrix, return true
            }
        }

        return false;

    }

    public int binarySearch(int nums[], int target){
        int left = 0, right = nums.length - 1, mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;

            if(nums[mid] == target) return target;

            else if(nums[mid] > target) right = mid-1; //reduce search space to half
            else    left = mid + 1;
        }
        return 0;
    }
}
