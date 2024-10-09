class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int slow=0,fast=0;
        int count=0;
        int k=2;
        while(fast<n){
            if(fast>0 &&nums[fast]==nums[fast-1]){
                count++;
            }else{
                count=1;
            }
            
            if(count <=k){
                nums[slow]= nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}