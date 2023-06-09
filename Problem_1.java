//Time Complexity = O(N)
//Space Complexity = O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length ==0)return 0;
        int count = 1;
        int slow = 0;
        for(int i =1; i<nums.length;i++){
            if(nums[i]==nums[slow]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                slow++;
                nums[slow]=nums[i];
            }
        }
        return slow+1;
    }
}