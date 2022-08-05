
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
    	final int k = 2;

    	if(nums.length == 0) return 0;

    	int m = 1;
    	int count = 1;

    	for(int i = 1; i < nums.length; ++i) {
    		if(nums[i] == nums[i - 1]) {
			if(count < k) {
    			nums[m++] = nums[i];
    		}
    			count++;
		} else {
    			count = 1;
   			nums[m++] = nums[i];
    		}
    	}
		return m;
    }
}
