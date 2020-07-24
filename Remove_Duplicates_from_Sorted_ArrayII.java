// Time Complexity : O(n)
// Space Complexity : O(1) , in place 
// Did this code successfully run on Leetcode : Yes

/* Using 3 pointers, previous, slow and fast. flag is used identify duplicates if its more than 2*/

public class Remove_Duplicates_from_Sorted_ArrayII {
	public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int prev = 0;
        int slow = 1;
        int fast = 1;
        int flag = 0;
        
        while(fast < nums.length){
            
            // checking for duplicate number
            if(nums[fast] == nums[prev]){
                if(flag == 0){  // if duplicate is there for 2nd time
                    nums[slow] = nums[fast];
                    slow++;
                    fast++;
                    flag = 1;   //if we see same number, make flag =1
                }
                else{
                    fast++; // more duplicates exists, hence updtaing fast pointer
                }
            }
            else{   // if we see new number
                prev = fast;    // updating previous
                nums[slow] = nums[fast];
                slow++;
                fast++;
                flag = 0;
            }
        }
        return slow;
    }

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
	}

}
