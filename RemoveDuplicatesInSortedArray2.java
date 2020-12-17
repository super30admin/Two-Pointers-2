// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
/*
*initialize two pointer i and j pointing to index 1. pointer i is used to run through the input array.
* count variable is used to keep track of frequency of an element in the array. when the element is same as previous element count is increment else count is reset to 1.
* As long as count is less than or equal to 2,  element at index i is assigned to index j and j is incremented. Finally returning j
*/

// Your code here along with comments explaining your approach


public class RemoveDuplicatesInSortedArray2{
	
	public int removeDuplicates(int[] nums) {
		
	        if(nums==null || nums.length==0){
	            return 0;
	        }
	        
	        int  j=1, count=1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]==nums[i-1]){
	                count++;
	            }else{
	                count = 1;
	            }
	            
	            if(count<=2){
	                nums[j]=nums[i];
	                j++;
	            }
	        }
	        

	        return j;    
	    }
	
	public static void main(String[] args) {
		RemoveDuplicatesInSortedArray2 ob = new RemoveDuplicatesInSortedArray2();
		int[] nums = {1,1,1,2,2,3};
		System.out.println(ob.removeDuplicates(nums));
	}
}