// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        
        int slow = 1, fast = 1, cnt = 1;
        
        while(fast<nums.length){
            if(nums[fast] == nums[fast-1]){
                cnt++;
            }else{
                cnt =1;
            }
            if(cnt<=2){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}