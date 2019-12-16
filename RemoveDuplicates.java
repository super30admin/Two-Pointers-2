
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// Three cases to solve this problem.
// Case1: Set flag to true if slow pointer and fast pointer numbers are same. Increment slow, assign the value and increment fast pointer
// Case2: If they are not same, set flag to false. Increment fast and slow.
// Case3: If fast pointer and slow pointer values are same. And, if flag is true, increase only the fast pointer until 


class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0 || nums == null) {
            return 0;
        }
        
        int slow =0;
        int fast =1;
        
        boolean flag = false;
        
        while (fast < nums.length) {
            
            if (nums[slow] == nums[fast]) {
                if(!flag) {
                    flag = true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                }
                
                else {
                    while (fast < nums.length && nums[fast] == nums[fast-1]){
                        fast++;
                    }
                }
            }
            else {
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return slow+1;
 }
}