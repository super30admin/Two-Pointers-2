// Time Complexity : o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We will have two pointers 
// one counter to check no of occurrence of specific elements and 
// slow will move based on the counts

public class RemoveDuplicatesFromArrayII {
	
public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int count = 1, slow = 1, fast = 1;
        
        while(fast < nums.length) {
            if(nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }
                
            if(count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;   
        }
        return slow;
    }

}
