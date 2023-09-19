// Time Complexity : O(n) as it will traverse nums linearly
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem1 {
    public int removeDuplicates(int[] nums) {

        int j = 1, count = 1;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
