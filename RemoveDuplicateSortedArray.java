// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class RemoveDuplicateSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int idx = 0, count = 1;
            int n = nums.length;

            for(int i = 1; i < n; i++){
                if(nums[i] == nums[i - 1]){
                    count++;
                    if(count <= 2){
                        idx++;
                        nums[idx] = nums[i];
                    }
                    else{
                        continue;
                    }
                }
                else{
                    count = 1;
                    idx++;
                    nums[idx] = nums[i];
                }
            }
            return idx+1;
        }
    }
}
