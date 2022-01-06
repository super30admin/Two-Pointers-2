package twoPointers2;

public class RemoveDuplicatesFromSortedArrayII {
	//Time Complexity : O(n), where n is the length of nums. While loop of count is constant since
	//max count can be 2
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Solving RemoveDuplicatesFromSortedArrayI first 
	//was the key
	public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        int curr = 0;
        
        while(right < nums.length) {
            int count = 0;
            while(right < nums.length && nums[left] == nums[right]) {
                right++;
                count++;
            }
            
            if(count <= 2) {
                while(count > 0) {
                    nums[curr++] =  nums[left];
                    count--;
                }
            } else if(count > 2) {
                nums[curr++] = nums[left];
                nums[curr++] = nums[left];
            }
            
            left = right;
        }
        
        return curr;
    }
}
