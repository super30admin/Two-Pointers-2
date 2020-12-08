/**
 * Leet - 80
 * Time Complexity - O(N)
 * Space Complexity - O(1)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int j = 1, cnt = 1;
            for(int i = 1;i < nums.length;i++){
                if(nums[i] == nums[i-1]){
                    cnt++;
                }
                else{
                    cnt = 1;
                }
                if(cnt <= 2){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        
    }
}