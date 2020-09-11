Time Complexity: O(n)
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    //see notes for alternate solution
    public int removeDuplicates(int[] nums) {
        int count = 1, fast = 1, slow = 0;
        
        while(fast < nums.length){
            if(nums[fast] == nums[slow]){
                if(count < 2){
                    slow++;
                    nums[slow] = nums[fast];
                    count++;
                }
            } else{
                slow++;
                nums[slow] = nums[fast];
                count = 1;
            }
            fast++;
        }
        
        return slow + 1;
    }
}
