// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else count = 1;
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
