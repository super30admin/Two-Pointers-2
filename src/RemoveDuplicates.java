// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * iterate over an given array, check for the count of current number seen,
 * if count <= 2, those numbers are at correct position, once count > 2, next larger number
 * will take this position. 
 */

// Your code here along with comments explaining your approach

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 *
 */
public class RemoveDuplicates {
	 public int removeDuplicates(int[] nums) {
	        //edge case
	        if(nums == null || nums.length == 0) return 0;
	        
	        //j used to keep track of count and correct position for next number
	        int j = 0, count = 0;
	        
	        for(int i = 0; i< nums.length; i++) {
	        		
	        		//first number is unique so increase count,
	            if(i == 0 || nums[i] == nums[i-1]) {
	                count ++;
	            } else {
	                count = 1;
	            }
	            
	            //use j to keep track of the 2 or less duplicates
	            if(count <= 2) {
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        return j;
	    }
}
