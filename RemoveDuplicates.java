// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Use slow and fast pointer and count =1 variable
// Fast pointer will traversing the whole array 
// Whenever count is less thn 2 and value at fast pointer and prev to fast pointer is same : increase the count and swap values increase slow pointer
// Whenever count is greater or equal to 2 and value at fast pointer and prev to fast pointer is not same  : increase the count 
// whenever pair is not equal reset the count to 1 and swap the slow and prev pointer
// Your code here along with comments explaining your approach


public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
	        
	        if(nums==null || nums.length==0)
	            return 0;
	    
	        int count =1;int j=1;
	       
	        for(int i=1;i<nums.length;i++){
	        
	            if(count<2 && nums[i]==nums[i-1]){
	                count++;
	                nums[j] = nums[i];
	                j++;
	            }
	            else if(count>=2 && nums[i]==nums[i-1]){
	                count++;
	            }
	            else
	            {
	                count =1;
	                nums[j++] = nums[i];
	            }
	           
	        }
	        
	        return j;
	        
	    }
}
