public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(nums==null || n<0) return 0;
        int slow = 1, count = 1;
        for(int fast=1;fast<n;fast++){
            if(nums[fast]==nums[fast-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}

// TC - O(n)
// SC - O(1)
