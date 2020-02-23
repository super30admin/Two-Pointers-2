// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : No

class RemoverDupSortedArray {
    public int removeDuplicates(int[] nums) {
        int s = 2;
        int f =2;
        while(s<=f && f < nums.length){
            if(nums[f]>nums[s-2]){
                nums[s]=nums[f];
                s++;
                f++;

            }
            else{
                f++;
            }
        }
        return s;
    }
}
