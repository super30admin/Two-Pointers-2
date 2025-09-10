class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=0;
        int count=0;
        while(fast<nums.length){
            if(fast!=0 && nums[fast]== nums[fast-1]){
                count++;
            }
            else{
                count=1;
            }

            if(count<=2){
                nums[slow]= nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}