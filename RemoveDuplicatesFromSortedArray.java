//Time: O(n)
//Space: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {

        int k=2;

        int slow=0, fast=0;
        int count=0;

        while(fast<nums.length){

            if(fast!=0 && nums[fast]==nums[fast-1]){
                count++;
            }
            else
                count=1;

            if(count<=k){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}