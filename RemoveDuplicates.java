// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        //pointer without element appearing more than twice
        int i = 0;
        //current pointer
        int j = 0;
        int count = 1;
        while(j < nums.length){
            if(j!=0 && nums[j] == nums[j - 1])
                count++;
            else
                count = 1;
            //copy the number if count is less than or equal to two
            if(count <= 2)
                nums[i++] = nums[j];
            j++;
        }
        return i;
    }
}