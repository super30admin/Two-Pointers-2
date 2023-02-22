class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int slow=1;
        int count=1;
       for(i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) count++;
            else count =1;
            if(count<=2) {
            nums[slow]= nums[i];
            slow++;
            }
        }
        return slow;
    }
}