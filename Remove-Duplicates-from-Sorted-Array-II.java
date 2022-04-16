class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int slow = 1;
        int count = 1;
        for(int fast = 1;fast<nums.length;fast++){
            if(nums[fast] == nums[fast - 1]){
                count++;
            }else {
                count = 1;   
            }
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}

// Time Complexity : O(n)
// Spcae Complexity : O(1)