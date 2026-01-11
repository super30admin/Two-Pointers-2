class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=0;
        int count=0;

        while(fast<nums.length){
            int curr=nums[fast];
            while(fast<nums.length && nums[fast]==curr){
                fast++;
                count++;
            }
            int jumps=Math.min(count,2);

            while(jumps!=0){
                nums[slow]=curr;
                slow++;
                jumps--;
            }
            count=0;
        }
        return slow;
    }
}