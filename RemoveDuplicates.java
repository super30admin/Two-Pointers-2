
// Time Complexity : O(n). n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums==null || nums.length==0) return 0;
			
			int i=1,j=1,count=1;
			while(j<nums.length) {
				if(nums[j]==nums[j-1]) {
					count++;
				}else {
					count=1;
				}
				
				if(count<=2) {
					nums[i]=nums[j];
					j++;i++;
				}else {
					nums[i]=nums[j];
					j++;
				}
					
			}
			return i;
    }
}
