//TimeComplexity O(n)
//SpaceComplexity O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
       
        if(nums.length == 0)return 0;
        int slow = 1;
        int count = 1;
        int k = 2;
        for(int fast = 1 ;fast < nums.length; fast++){
            if(nums[fast] == nums[fast-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
