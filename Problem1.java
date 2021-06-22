// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes

class Problem1 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int counter = 1;
        int j = 1;
    
        
        for(int i=1; i<nums.length; i++){
          // if this element is equal to prev element, increment the counter
            if(nums[i] == nums[i-1]){
                counter++;
            }
          // if this element is not equal to prev element, reset counter
            else {
                counter = 1;   
            }
          // if counter is less than or equal to 2, put ith element at jth position and increment j
            if(counter <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}