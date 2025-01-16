//Time complexity : O(n)
//Space Complexity : O(1)
// Did the code run in leetcode : yes

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int count = 1;
        int n = nums.length;
        int j = 1;
        for(int i = 1; i<n; i++){

            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}